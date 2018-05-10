
package www.wsib.on.ca.services.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the www.wsib.on.ca.services.documentservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Code_QNAME = new QName("http://www.wsib.on.ca/services", "Code");
    private final static QName _Description_QNAME = new QName("http://www.wsib.on.ca/services", "Description");
    private final static QName _ClientID_QNAME = new QName("http://www.wsib.on.ca/services", "ClientID");
    private final static QName _ClientName_QNAME = new QName("http://www.wsib.on.ca/services", "ClientName");
    private final static QName _RequestReference_QNAME = new QName("http://www.wsib.on.ca/services", "RequestReference");
    private final static QName _TransactionTime_QNAME = new QName("http://www.wsib.on.ca/services", "TransactionTime");
    private final static QName _IsSuccessful_QNAME = new QName("http://www.wsib.on.ca/services", "IsSuccessful");
    private final static QName _Authentication_QNAME = new QName("http://guidewire.com/ws/soapheaders", "authentication");
    private final static QName _Locale_QNAME = new QName("http://guidewire.com/ws/soapheaders", "locale");
    private final static QName _TransactionId_QNAME = new QName("http://guidewire.com/ws/soapheaders", "transaction_id");
    private final static QName _DocumentID_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "documentID");
    private final static QName _Status_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "status");
    private final static QName _ExternalDocumentID_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "externalDocumentID");
    private final static QName _DocumentName_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "documentName");
    private final static QName _DocumentType_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "documentType");
    private final static QName _UploadDocumentRequest_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "UploadDocumentRequest");
    private final static QName _UploadDocumentResponse_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "UploadDocumentResponse");
    private final static QName _Author_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "author");
    private final static QName _CreationDate_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "creationDate");
    private final static QName _ReceivedDate_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "receivedDate");
    private final static QName _Name_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "name");
    private final static QName _MimeType_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "mimeType");
    private final static QName _Type_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "type");
    private final static QName _IntakeSource_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "intakeSource");
    private final static QName _FormId_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "formId");
    private final static QName _Content_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "content");
    private final static QName _ClaimNumber_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "claimNumber");
    private final static QName _AccountNumber_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "accountNumber");
    private final static QName _PolicyNumber_QNAME = new QName("http://www.wsib.on.ca/services/documentmanagementservice", "policyNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: www.wsib.on.ca.services.documentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadDocument }
     * 
     */
    public UploadDocument createUploadDocument() {
        return new UploadDocument();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse }
     * 
     */
    public UploadDocumentResponse createUploadDocumentResponse() {
        return new UploadDocumentResponse();
    }

    /**
     * Create an instance of {@link BaseRequestType }
     * 
     */
    public BaseRequestType createBaseRequestType() {
        return new BaseRequestType();
    }

    /**
     * Create an instance of {@link BaseResponseType }
     * 
     */
    public BaseResponseType createBaseResponseType() {
        return new BaseResponseType();
    }

    /**
     * Create an instance of {@link ErrorInfoType }
     * 
     */
    public ErrorInfoType createErrorInfoType() {
        return new ErrorInfoType();
    }

    /**
     * Create an instance of {@link ClientInfo }
     * 
     */
    public ClientInfo createClientInfo() {
        return new ClientInfo();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link TransactionId }
     * 
     */
    public TransactionId createTransactionId() {
        return new TransactionId();
    }

    /**
     * Create an instance of {@link UploadDocumentReqType }
     * 
     */
    public UploadDocumentReqType createUploadDocumentReqType() {
        return new UploadDocumentReqType();
    }

    /**
     * Create an instance of {@link UploadDocumentResType }
     * 
     */
    public UploadDocumentResType createUploadDocumentResType() {
        return new UploadDocumentResType();
    }

    /**
     * Create an instance of {@link UploadReqType }
     * 
     */
    public UploadReqType createUploadReqType() {
        return new UploadReqType();
    }

    /**
     * Create an instance of {@link UploadResType }
     * 
     */
    public UploadResType createUploadResType() {
        return new UploadResType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DocuentResType }
     * 
     */
    public DocuentResType createDocuentResType() {
        return new DocuentResType();
    }

    /**
     * Create an instance of {@link DocumentReqType }
     * 
     */
    public DocumentReqType createDocumentReqType() {
        return new DocumentReqType();
    }

    /**
     * Create an instance of {@link UploadDocument.UploadRequest }
     * 
     */
    public UploadDocument.UploadRequest createUploadDocumentUploadRequest() {
        return new UploadDocument.UploadRequest();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse.Return }
     * 
     */
    public UploadDocumentResponse.Return createUploadDocumentResponseReturn() {
        return new UploadDocumentResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "Code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "ClientID")
    public JAXBElement<ClientIDType> createClientID(ClientIDType value) {
        return new JAXBElement<ClientIDType>(_ClientID_QNAME, ClientIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "ClientName")
    public JAXBElement<String> createClientName(String value) {
        return new JAXBElement<String>(_ClientName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "RequestReference")
    public JAXBElement<String> createRequestReference(String value) {
        return new JAXBElement<String>(_RequestReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "TransactionTime")
    public JAXBElement<XMLGregorianCalendar> createTransactionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransactionTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YesNoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services", name = "IsSuccessful")
    public JAXBElement<YesNoType> createIsSuccessful(YesNoType value) {
        return new JAXBElement<YesNoType>(_IsSuccessful_QNAME, YesNoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "locale")
    public JAXBElement<Locale> createLocale(Locale value) {
        return new JAXBElement<Locale>(_Locale_QNAME, Locale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://guidewire.com/ws/soapheaders", name = "transaction_id")
    public JAXBElement<TransactionId> createTransactionId(TransactionId value) {
        return new JAXBElement<TransactionId>(_TransactionId_QNAME, TransactionId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "documentID")
    public JAXBElement<String> createDocumentID(String value) {
        return new JAXBElement<String>(_DocumentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YesNoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "status")
    public JAXBElement<YesNoType> createStatus(YesNoType value) {
        return new JAXBElement<YesNoType>(_Status_QNAME, YesNoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "externalDocumentID")
    public JAXBElement<String> createExternalDocumentID(String value) {
        return new JAXBElement<String>(_ExternalDocumentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "documentName")
    public JAXBElement<String> createDocumentName(String value) {
        return new JAXBElement<String>(_DocumentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "documentType")
    public JAXBElement<String> createDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "UploadDocumentRequest")
    public JAXBElement<UploadDocumentReqType> createUploadDocumentRequest(UploadDocumentReqType value) {
        return new JAXBElement<UploadDocumentReqType>(_UploadDocumentRequest_QNAME, UploadDocumentReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "UploadDocumentResponse")
    public JAXBElement<UploadDocumentResType> createUploadDocumentResponse(UploadDocumentResType value) {
        return new JAXBElement<UploadDocumentResType>(_UploadDocumentResponse_QNAME, UploadDocumentResType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "author")
    public JAXBElement<String> createAuthor(String value) {
        return new JAXBElement<String>(_Author_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "creationDate")
    public JAXBElement<String> createCreationDate(String value) {
        return new JAXBElement<String>(_CreationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "receivedDate")
    public JAXBElement<String> createReceivedDate(String value) {
        return new JAXBElement<String>(_ReceivedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "mimeType")
    public JAXBElement<String> createMimeType(String value) {
        return new JAXBElement<String>(_MimeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "intakeSource")
    public JAXBElement<String> createIntakeSource(String value) {
        return new JAXBElement<String>(_IntakeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "formId")
    public JAXBElement<String> createFormId(String value) {
        return new JAXBElement<String>(_FormId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "content")
    public JAXBElement<byte[]> createContent(byte[] value) {
        return new JAXBElement<byte[]>(_Content_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "claimNumber")
    public JAXBElement<String> createClaimNumber(String value) {
        return new JAXBElement<String>(_ClaimNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "accountNumber")
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<String>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wsib.on.ca/services/documentmanagementservice", name = "policyNumber")
    public JAXBElement<String> createPolicyNumber(String value) {
        return new JAXBElement<String>(_PolicyNumber_QNAME, String.class, null, value);
    }

}
