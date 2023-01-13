package com.example.kaykastreamsanalytics;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KaykaStreamsAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaykaStreamsAnalyticsApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(KafkaStreamsRepository kafkaStreamsRepository){
		return args -> {

			kafkaStreamsRepository.save(new Page_Event(null,"Home","U1",new Date(),1000L));
		};
	}*/
}
