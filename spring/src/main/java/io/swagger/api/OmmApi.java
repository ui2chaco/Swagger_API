/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorModel;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.OrderModel;
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
@Api(value = "omm", description = "the omm API")
public interface OmmApi {

    @ApiOperation(value = "Search order information", nickname = "ommOrdersGet", notes = "", response = OrderModel.class, responseContainer = "List", tags={ "Order Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned an order", response = OrderModel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/omm/orders",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderModel>> ommOrdersGet(@Min(1)@ApiParam(value = "The number of items to skip before returning the results", allowableValues = "") @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1) @Max(100) @ApiParam(value = "The number of items to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "From Order Date") @Valid @RequestParam(value = "odf", required = false) OffsetDateTime odf,@ApiParam(value = "To Order Date") @Valid @RequestParam(value = "odt", required = false) OffsetDateTime odt,@ApiParam(value = "Minimum Order Amount") @Valid @RequestParam(value = "oaf", required = false) Double oaf,@ApiParam(value = "Maximum Order Amount") @Valid @RequestParam(value = "oat", required = false) Double oat,@ApiParam(value = "Customize Search Parameters") @Valid @RequestParam(value = "csp", required = false) String csp,@ApiParam(value = "Test Parameter") @Valid @RequestParam(value = "tp1", required = false) String tp1);


    @ApiOperation(value = "Detail order information", nickname = "ommOrdersOrderIdGet", notes = "", response = OrderModel.class, tags={ "Order Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned an order", response = OrderModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/omm/orders/{orderId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrderModel> ommOrdersOrderIdGet(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId);


    @ApiOperation(value = "Update order infromation", nickname = "ommOrdersOrderIdPut", notes = "", response = OrderModel.class, tags={ "Order Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated an order", response = OrderModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/omm/orders/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<OrderModel> ommOrdersOrderIdPut(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = ""  )  @Valid @RequestBody OrderModel body);


    @ApiOperation(value = "Update order status", nickname = "ommOrdersOrderIdStatusOrderStatusPatch", notes = "", tags={ "Order Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully Updated an order status"),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/omm/orders/{orderId}/status/{orderStatus}",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ommOrdersOrderIdStatusOrderStatusPatch(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "注文状態",required=true) @PathVariable("orderStatus") String orderStatus);


    @ApiOperation(value = "Create order information", nickname = "ommOrdersPost", notes = "", response = OrderModel.class, tags={ "Order Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created an order", response = OrderModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/omm/orders",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OrderModel> ommOrdersPost(@ApiParam(value = ""  )  @Valid @RequestBody OrderModel body);

}
