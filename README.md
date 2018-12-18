# Swagger generated server

Adidas Spring Boot API Subscription Service

•	mvn clean install

•	mvn spring-boot:run

•	starts on port 8091

•	This will start the api that andle all the DB Registration services

•	For Data Base is configured with H2, a memory DB 

•	Depends on Adidas Spring Boot API Subscription Service AND Adidas Spring Boot Eureka Server. Also has a kafka communication but this request is no circuit cutter

•	use kafka for teh concept os circuit braker the 2 services call with kafka producers does  not restrict  the flow

## Overview  

Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8091/  

Change default port value in application.properties
