package ca.on.wsib.digital.eclaims.orchestration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GWICreateClaimServiceClientConfig {
/*
	@Value("${gw.webservice.uri}")
	private String defaultUri;

	@Value("${gw.client.user.name}")
	private String userName;

	@Value("${gw.client.user.password}")
	private String userPassword;
*/

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this is the package name specified in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("ca.on.wsib.cc.webservices.createclaim");
		return marshaller;
	}

	@Bean
	public GWICreateClaimServiceClient gwCreateClaimServiceCall(Jaxb2Marshaller marshaller) {
		GWICreateClaimServiceClient client = new GWICreateClaimServiceClient();
		client.setDefaultUri("http://localhost:8080/service/student-details");
		
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}