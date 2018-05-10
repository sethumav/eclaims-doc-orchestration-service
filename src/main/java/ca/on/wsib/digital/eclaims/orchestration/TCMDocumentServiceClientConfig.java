package ca.on.wsib.digital.eclaims.orchestration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class TCMDocumentServiceClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ca.on.wsib.tcm.ws.model");
        return marshaller;
    }
 
    @Bean
    public TCMDocumentServiceClient tcmDocumentServiceCall(Jaxb2Marshaller marshaller) {
    	TCMDocumentServiceClient client = new TCMDocumentServiceClient();
        client.setDefaultUri("http://localhost:8080/service/student-details");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}