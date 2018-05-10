package ca.on.wsib.digital.eclaims.orchestration;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class TCMDocumentServiceClient extends WebServiceGatewaySupport {
 
    public Object callWebService(String url, Object request){
    	Object obj = getWebServiceTemplate().marshalSendAndReceive(url, request);
    	return obj;
    }
}