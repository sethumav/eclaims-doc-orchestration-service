package ca.on.wsib.digital.eclaims.orchestration;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.activation.DataHandler;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sun.xml.ws.util.ByteArrayDataSource;

import ca.on.wsib.cc.webservices.createclaim.Claim;
import ca.on.wsib.cc.webservices.createclaim.Claim.Documents;
import ca.on.wsib.cc.webservices.createclaim.Claim.Documents.Entry.DateCreated;
import ca.on.wsib.cc.webservices.createclaim.Claim.Documents.Entry.WSIBDateReceived;
import ca.on.wsib.cc.webservices.createclaim.CreateClaimResponse;
import ca.on.wsib.cc.webservices.createclaim.CreateDraftClaim;
import ca.on.wsib.cc.webservices.createclaim.CreateDraftClaimResponse;
import ca.on.wsib.digital.eclaims.orchestration.model.Attachment;
import ca.on.wsib.digital.eclaims.orchestration.model.DocumentSubmissionStatus;
import ca.on.wsib.digital.eclaims.orchestration.model.SubmissionRequest;
import ca.on.wsib.digital.eclaims.orchestration.model.SubmissionStatusMsg;
import ca.on.wsib.tcm.ws.model.ObjectFactory;
import ca.on.wsib.tcm.ws.model.UploadClaimsDocument;
import ca.on.wsib.tcm.ws.model.UploadClaimsDocumentClaimsMetaData;
import ca.on.wsib.tcm.ws.model.UploadClaimsDocumentFileInfo;
import ca.on.wsib.tcm.ws.model.UploadClaimsDocumentIntegrationMetaData;
import www.wsib.on.ca.services.documentservice.ClientIDType;
import www.wsib.on.ca.services.documentservice.ClientInfo;
import www.wsib.on.ca.services.documentservice.DocumentReqType;
import www.wsib.on.ca.services.documentservice.LanguageType;
import www.wsib.on.ca.services.documentservice.UploadDocument;
import www.wsib.on.ca.services.documentservice.UploadDocument.UploadRequest;
import www.wsib.on.ca.services.documentservice.UploadDocumentReqType;
import www.wsib.on.ca.services.documentservice.UploadReqType;


@Service
@Configurable
public class EClaimSubmissionKafkaListener {

    @Value("${GW.ws.endpoint.createclaim.endpoint}")
    private String createClaimEndpoint;

    @Value("${kafka.topic.eclaim-submission}")
    private String eclaimSubmissionTopic;
     
    @Autowired
    private DocumentStatusPublisher documentStatusPublisher;

    
	/*    @KafkaListener(topicPattern = "test")
    public void process(String message) {
        System.out.println("SoutKafkaListener received: " + message);
    }

	 */
	static AnnotationConfigApplicationContext tcmContext = new AnnotationConfigApplicationContext(
			TCMDocumentServiceClientConfig.class);
	TCMDocumentServiceClient tcmWebServiceClient = tcmContext.getBean(TCMDocumentServiceClient.class);

	
	static AnnotationConfigApplicationContext gwContext = new AnnotationConfigApplicationContext(
			GWICreateClaimServiceClientConfig.class);
	
	GWICreateClaimServiceClient gwWebServiceClient = gwContext.getBean(GWICreateClaimServiceClient.class);

	@KafkaListener(topicPattern = "eclaims-dev-submissions")
	public void process(SubmissionRequest subRequest) {
		


		subRequest.getAttachments().forEach(attachmnt-> {
//			RestTemplate restTemplate = new RestTemplate();
			System.out.println("EClaimSubmissionKafkaListener received claim number : " + subRequest.getClaimNumber());
			System.out.println("attachmnt.getFile() : " + attachmnt.getFile() );
//			ResponseEntity<byte[]> response		= restTemplate.getForEntity(attachmnt.getFile() , byte[].class);
//			System.out.println("response.getStatusCode() : " + response.getStatusCode());
//			byte[] fileContent= response.getBody();
			String contentStr = " this is a test";
			byte[] fileContent = contentStr.getBytes();

			UploadClaimsDocument request = null;
			try {
				String fileName = createFileName(attachmnt);			
/*				
				// call TCM WebService
				request = CreateTCMUploadMessage(subRequest.getClaimNumber(), fileContent, attachmnt, fileName);
				JAXBElement<UploadClaimsDocumentResponse> tcmDocumentServiceresponse = (JAXBElement<UploadClaimsDocumentResponse>)tcmWebServiceClient.callWebService("http://localhost:9090/TCMWebServices-v1/Claims", request); 
				UploadClaimsDocumentResponse uploadDocResponse = tcmDocumentServiceresponse.getValue();
				int tcmDocId = uploadDocResponse.getDocumentId();
				System.out.println("tcmDocId: " + tcmDocId) ;
*/
				int tcmDocId = 12333;
				
				// call GuideWire WebService
				CreateDraftClaim createDraftClaim = CreateGWCreateClaimMessage(subRequest.getClaimNumber(), fileContent, attachmnt, tcmDocId, fileName );
				CreateDraftClaimResponse gwICreateDraftDocResponse = (CreateDraftClaimResponse)gwWebServiceClient.callWebService(createClaimEndpoint, createDraftClaim); 
				CreateClaimResponse gwICreateDocResponse = gwICreateDraftDocResponse.getReturn();
				
				String status="";
				if( gwICreateDocResponse.getClaimNumber() != null)
				{
					System.out.println("gwICreateDocResponse.getClaimNumber(): " + gwICreateDocResponse.getClaimNumber()) ;
					System.out.println("gwICreateDocResponse.getClaimNumber(): " + gwICreateDocResponse.getDocumentMetaDataList().getEntry().get(0).getDocPublicId());
					status = "submitted";
				}
				else
				{
					status =  "error" ;
				}
				status= gwICreateDocResponse.getClaimNumber() != null ? "error" : "submitted";
					
						
				DocumentSubmissionStatus documentSubmissionStatus  = new DocumentSubmissionStatus("sdsd","sdsds");
				List<DocumentSubmissionStatus> documentSubmissionStatusList = new ArrayList<DocumentSubmissionStatus>();
				documentSubmissionStatusList.add(documentSubmissionStatus);
				SubmissionStatusMsg submissionStatusMsg = new SubmissionStatusMsg("sdsd",status,documentSubmissionStatusList);
				try {
					documentStatusPublisher.send(submissionStatusMsg);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			restTemplate = null;


		});

	}
	
	public UploadRequest CreateGWDocumentRequest(String claimNumber, byte[] fileContent, Attachment attachment, int tcmDocId, String fileName ) throws DatatypeConfigurationException
	{

		www.wsib.on.ca.services.documentservice.ObjectFactory factory = new www.wsib.on.ca.services.documentservice.ObjectFactory();

		UploadDocument uploadDocument = new UploadDocument();
		
		UploadRequest uploadRequest = new UploadRequest();
		
		UploadDocumentReqType uploadDocumentRequest = new UploadDocumentReqType();
		ClientInfo clientInfo = new ClientInfo();
		clientInfo.setClientID(ClientIDType.ESB);
		clientInfo.setClientName("Portal");
		clientInfo.setRequestReference("1001");
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());

		XMLGregorianCalendar gd = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		clientInfo.setTransactionTime(gd);
		
		
		uploadDocumentRequest.setClientInfo(clientInfo);
		
		
		uploadDocumentRequest.setLanguage(LanguageType.EN_US);
		
		UploadReqType uploadReq = new UploadReqType();
		uploadReq.setClaimNumber(claimNumber);
		DocumentReqType documentReq = new DocumentReqType();
		documentReq.setAuthor("Portal");
		documentReq.setContent(fileContent);
		documentReq.setCreationDate("2018-12-31T12:00:00");
		documentReq.setDocumentName(fileName);
		documentReq.setDocumentType("General");
		documentReq.setIntakeSource("Portal");
		documentReq.setFormId("5");
		documentReq.setExternalDocumentID("0");
		documentReq.setMimeType("text/plain");
		documentReq.setName(fileName);
		documentReq.setType("General");
		
		uploadReq.getDocument().add(documentReq);
		uploadDocumentRequest.setUploadRequest(uploadReq);
		
		
		
		
		uploadRequest.setUploadDocumentRequest(uploadDocumentRequest);
		
		
		uploadDocument.setUploadRequest(uploadRequest);
		
		

		return uploadRequest;

	}
	

	public CreateDraftClaim CreateGWCreateClaimMessage(String claimNumber, byte[] fileContent, Attachment attachment, int tcmDocId, String fileName )
	{

		ca.on.wsib.cc.webservices.createclaim.ObjectFactory factory = new ca.on.wsib.cc.webservices.createclaim.ObjectFactory();
		DateCreated dateCreated = factory.createClaimDocumentsEntryDateCreated();

		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss.S");
		format.setTimeZone(TimeZone.getTimeZone("GMT"));

		String dateString = format.format(new Date());
		dateString += "-04:00";
		dateCreated.setXmlDateTime(dateString );
		
		CreateDraftClaim createDraftClaim = new CreateDraftClaim();
		Claim claim = new Claim();
		claim.setClaimNumber(claimNumber);

		Documents documents= factory.createClaimDocuments();
		List<Claim.Documents.Entry> entryList = documents.getEntry();
		Claim.Documents.Entry entry = factory.createClaimDocumentsEntry();
		entry.setAuthor("system");
		entry.setDocUID(String.valueOf(tcmDocId));
		entry.setName(fileName);

		WSIBDateReceived dateRecieved = factory.createClaimDocumentsEntryWSIBDateReceived();
		dateRecieved.setXmlDateTime(dateString);
		entry.setWSIBDateReceived(dateRecieved);
		entry.setWSIBDocSubSection("SENTWORKER");
		entry.setWSIBDocumentSection("COR");
		entry.setWSIBFormID("3853A");
		entry.setWSIBUDID("123");
		entry.setDateCreated(dateCreated);
		entry.setDescription("Digital Portal Document");

		entryList.add(entry);

		claim.setDocuments(documents);

		createDraftClaim.setRequest(claim);

		return createDraftClaim;

	}


	public UploadClaimsDocument CreateTCMUploadMessage(String claimNumber, byte[] fileContent, Attachment attachment, String fileName) throws DatatypeConfigurationException
	{
		ObjectFactory factory = new ObjectFactory();
		UploadClaimsDocument  request = factory.createUploadClaimsDocument();
		UploadClaimsDocumentClaimsMetaData claimMetaData = factory.createUploadClaimsDocumentClaimsMetaData();

		claimMetaData.setClaimNumber(claimNumber);

		claimMetaData.setFormID("3853A");
		claimMetaData.setFileSection("COR");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar gd = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		claimMetaData.setDocumentDate(gd);
		claimMetaData.setAuthor("system");
		claimMetaData.setFileSubSection("SENTWORKER");

		request.setClaimMetaData(claimMetaData);

		UploadClaimsDocumentIntegrationMetaData integrationMetaData = new UploadClaimsDocumentIntegrationMetaData ();
		integrationMetaData.setChannelID("123");
		integrationMetaData.setChannelUser("me");

		request.setIntegrationMetaData(integrationMetaData);

		ByteArrayDataSource bs = new ByteArrayDataSource(fileContent, fileContent.length, null);

		DataHandler dataHandler= new DataHandler(bs);


		UploadClaimsDocumentFileInfo fileInfo = new UploadClaimsDocumentFileInfo();
		fileInfo.setFileDescription("File from digital");
		createFileName(attachment);
		SimpleDateFormat format = new SimpleDateFormat ("yyyyMMddHHmmss"); 
		String dateString = format.format(c.getTime());
		fileInfo.setFileName(fileName);

		request.setFileInfo(fileInfo);
		request.setFileContent(dataHandler);

		return request;
	}

	String createFileName(Attachment attachment) throws DatatypeConfigurationException
	{
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar gd = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		SimpleDateFormat format = new SimpleDateFormat ("yyyyMMddHHmmss"); 
		String dateString = format.format(c.getTime());
		return attachment.getType() + dateString + ".doc";

	}

	
	private static String getOffset(LocalDateTime dateTime, ZoneId id) {
	    return dateTime
	      .atZone(id)
	      .getOffset()
	      .getId()
	      .replace("Z", "+00:00");
	}
}
