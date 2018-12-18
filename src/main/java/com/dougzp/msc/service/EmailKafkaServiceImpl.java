package com.dougzp.msc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class EmailKafkaServiceImpl implements IEmailKafkaService {
	
	private static final Logger log = LoggerFactory.getLogger(EmailKafkaServiceImpl.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value(value = "${email.topic.name}")
	private String topicEmail;

	@SuppressWarnings("unchecked")
	public void registerEmail(String email) {
		try {

			ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicEmail, email);
			future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

				@Override
				public void onSuccess(final SendResult<String, String> message) {
				}

				@Override
				public void onFailure(final Throwable throwable) {
				}
			});

		} catch (Exception e) {
			log.error("Faild to send message do eventService");
		}
		
	}

	
	
	
	

}