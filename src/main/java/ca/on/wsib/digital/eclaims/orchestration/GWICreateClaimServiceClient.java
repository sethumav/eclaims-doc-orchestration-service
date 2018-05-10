package ca.on.wsib.digital.eclaims.orchestration;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import ca.on.wsib.cc.webservices.createclaim.Authentication;
import ca.on.wsib.cc.webservices.createclaim.ObjectFactory;


//@EnableConfigurationProperties
public class GWICreateClaimServiceClient extends WebServiceGatewaySupport {

//	@Autowired
//	@Qualifier("webServiceTemplate")
//	private WebServiceTemplate webServiceTemplate;


//	@Value("${kafka.broker.address}")
//	private String brokerAddress;

    @Value("${GW.ws.endpoint.createclaim.username}")
    private String createClaimUsername;
	
    @Value("${GW.ws.endpoint.createclaim.password}")
    private String createClaimPassword;

    public Object callWebService(String url, Object request){
/*		WebServiceTemplate webserviceTemplate = getWebServiceTemplate();
		ClientInterceptor[] interceptors = webserviceTemplate.getInterceptors();
		return getWebServiceTemplate()
				.marshalSendAndReceive(url, request);
*/
//    	ConfigurableApplicationContext context = new SpringApplicationBuilder(EclaimDocOrchServiceApplication.class)
/*		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				EclaimDocOrchServiceApplication.class);
		ConfigurableEnvironment env = context.getEnvironment();
		String val = env.getProperty("kafka.broker.address");
		context.close();
*/		
		return getWebServiceTemplate().marshalSendAndReceive(url,request,
				new WebServiceMessageCallback() {
					public void doWithMessage(WebServiceMessage message)
							throws IOException, TransformerException {
						SoapMessage soapMessage = (SoapMessage) message;
//						soapMessage.setSoapAction(serviceSoapAction);
						org.springframework.ws.soap.SoapHeader soapheader = soapMessage
								.getSoapHeader();
						final StringWriter out = new StringWriter();
						getWebServiceTemplate().getMarshaller().marshal(getHeader("testuser", "welcome1"),
												new StreamResult(out));
						Transformer transformer = TransformerFactory
								.newInstance().newTransformer();
						transformer.transform(new StringSource(out.toString()),
								soapheader.getResult());
					}
				});
	}
	
	  private Object getHeader(final String userId, final String password) {
			final ObjectFactory headerObjectFactory = new ObjectFactory();
			final Authentication applicationCredentials = new Authentication();
			applicationCredentials.setUsername(userId);
			applicationCredentials.setPassword(password);
			final JAXBElement<Authentication> header = headerObjectFactory
					.createAuthentication(applicationCredentials);
			return header;
		}
}