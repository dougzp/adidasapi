package com.dougzp.msc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.dougzp.msc.model.Subscriptor;


@FeignClient("adidas-db-registration-service")
public interface ISubscriptionRegister {

	
	
	@PostMapping("/subscriptor")
	public ResponseEntity<Subscriptor> registerSubscription(@RequestHeader("ADIDAS-Auth-Token") String token,@RequestBody Subscriptor subscriptor);
	
}
