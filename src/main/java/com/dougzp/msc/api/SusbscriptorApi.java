/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.dougzp.msc.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.dougzp.msc.model.Subscriptor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-12T16:56:00.547Z")

@Api(value = "subscribe-service", description = "the susbscriptor API")
public interface SusbscriptorApi {

    @ApiOperation(value = "RE", nickname = "subscribe", notes = "the Subscription service", response = Long.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Susbscriptor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Succesfully subrscived", response = Subscriptor.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 500, message = "Server Internal Error") })
    @RequestMapping(value = "/subscribe-service",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Object> subscribe(@ApiParam(value = ""  )  @Valid @RequestBody Subscriptor susbsriptor_);

}
