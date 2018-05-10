package ca.on.wsib.digital.eclaims.orchestration;



import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.SendResult;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import ca.on.wsib.digital.eclaims.orchestration.model.SubmissionStatusMsg;

@Component
@EnableAutoConfiguration
@PropertySource("classpath:application.yml")
public class DocumentStatusPublisher {

	@Value("${kafka.broker.address}")
	private String brokerAddress;

	@Value("${eclaim-submission-status}")
	private String topic;
	
	@Autowired
	private KafkaTemplate<String, SubmissionStatusMsg> kafkaTemplate;


	public void send(SubmissionStatusMsg submissionStatusMsg) throws Exception {
			sendClaimToTopic(submissionStatusMsg);
	}

	public void sendClaimToTopic(SubmissionStatusMsg submissionStatusMsg) throws Exception
	{
		ListenableFuture<SendResult<String, SubmissionStatusMsg>> future = null;
		future = kafkaTemplate.send(topic,submissionStatusMsg.getSubmissionId().toString(),submissionStatusMsg);
	    future.addCallback(new ListenableFutureCallback<SendResult< String, SubmissionStatusMsg>>()  {

	        @Override
	        public void onSuccess(SendResult<String , SubmissionStatusMsg> result) {
	        	System.out.println("Successfully sent claim status: " + result.getProducerRecord().value().getSubmissionId() +" to partition:" + result.getRecordMetadata().partition() );
	        }

	        @Override
	        public void onFailure(Throwable ex) {
	        	
	        }

	    } );
		

	}
	
	

	@Bean
	public ProducerFactory<String, SubmissionStatusMsg> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfigs());
	}

	@Bean
	public KafkaTemplate<String, SubmissionStatusMsg> kafkaTemplate() {
		return new KafkaTemplate<String, SubmissionStatusMsg>(producerFactory());
	}

	private Map<String, Object> producerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerAddress);
		props.put(ProducerConfig.RETRIES_CONFIG, 0);
		props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
		props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
		props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
		//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
		//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return props;
	}
}
