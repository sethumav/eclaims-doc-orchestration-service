package ca.on.wsib.digital.eclaims.orchestration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import ca.on.wsib.digital.eclaims.orchestration.model.SubmissionRequest;


@SpringBootApplication
@EnableKafka
public class EclaimDocOrchServiceApplication {

/*	public static void main(String[] args) {
		SpringApplication.run(EclaimDocOrchServiceApplication.class, args);
	}
*/
	
	   @Value("${kafka.broker.address}")
	    private String brokerAddress;

	    @Value("${kafka.consumer.concurrency}")
	    private int consumerConcurrency;

		public static void main(String[] args) {
//			SpringApplication.run(EclaimDocOrchestrationServiceApplication.class, args);
	        ConfigurableApplicationContext context
	        = new SpringApplicationBuilder(EclaimDocOrchServiceApplication.class)
	        .web(WebApplicationType.NONE)
	        .run(args);
		}
		
		@Bean
	    public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory() {
			ConcurrentKafkaListenerContainerFactory factory = new ConcurrentKafkaListenerContainerFactory();
	        factory.setConsumerFactory(consumerFactory());
	        factory.setConcurrency(consumerConcurrency);
	        return factory;
	    }

	    public ConsumerFactory<String, SubmissionRequest> consumerFactory() {
	   	 return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
			        new JsonDeserializer<>(SubmissionRequest.class));
		 
	    }

	    @Bean
	    public Map<String, Object> consumerConfigs() {
	        Map<String, Object> props = new HashMap<>();
	        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, this.brokerAddress);
	        props.put(ConsumerConfig.GROUP_ID_CONFIG, "eclaim-orch");
	        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
	        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
	        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
//	        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//	        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	        
	         return props;
	    }	
	
}
