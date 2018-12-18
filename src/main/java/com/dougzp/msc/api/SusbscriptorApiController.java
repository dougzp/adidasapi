package com.dougzp.msc.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.dougzp.msc.model.Subscriptor;
import com.dougzp.msc.service.IEmailKafkaService;
import com.dougzp.msc.service.IEventRegisterKafkaService;
import com.dougzp.msc.service.ISubscriptionRegister;

import com.fasterxml.jackson.databind.ObjectMapper;

import feign.FeignException;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-12T16:56:00.547Z")

@Controller
public class SusbscriptorApiController implements SusbscriptorApi {

    private static final Logger log = LoggerFactory.getLogger(SusbscriptorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
   
    private final String ENVENTRS="EVENT_REG_"; 
    
    @Autowired
    private ISubscriptionRegister subscriptionRegister;

    @Autowired
    private IEventRegisterKafkaService eventService;
    
    @Autowired
    private IEmailKafkaService emailService;
  
    @org.springframework.beans.factory.annotation.Autowired
    public SusbscriptorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> subscribe(@ApiParam(value = ""  )  @Valid @RequestBody Subscriptor susbsriptor_) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
			
        	//This is not a Circuit Braker service
        	
			emailService.registerEmail(susbsriptor_.getEmail());
			eventService.registerEvent(ENVENTRS+susbsriptor_.getEmail());
			try {

				ResponseEntity<Subscriptor> subscriptionResult = subscriptionRegister
						.registerSubscription("TOKEN_ADIDAS_AUTH",susbsriptor_);
				Long longIdResult = subscriptionResult.getBody().getId();

				return new ResponseEntity<Object>(longIdResult, HttpStatus.CREATED);

			} catch (FeignException ex) {
				if (ex.getMessage().contains("422")) {
					return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);

				} else {
					return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
				}

			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
