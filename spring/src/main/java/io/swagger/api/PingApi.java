/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-08T08:15:54.133Z[GMT]")
@Api(value = "ping", description = "the ping API")
public interface PingApi {

    @ApiOperation(value = "Server example operation", nickname = "pingGet", notes = "This is an example operation to show how security is applied to the call.", tags={ "common", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/ping",
        method = RequestMethod.GET)
    ResponseEntity<Void> pingGet();

}
