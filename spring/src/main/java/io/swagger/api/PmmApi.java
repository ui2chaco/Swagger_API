/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.ProductModel;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-08T07:57:14.380Z[GMT]")
@Api(value = "pmm", description = "the pmm API")
public interface PmmApi {

    @ApiOperation(value = "Search product information", nickname = "pmmProductsGet", notes = "", response = ProductModel.class, responseContainer = "List", tags={ "Product Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned an order", response = ProductModel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/pmm/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProductModel>> pmmProductsGet(@Min(1)@ApiParam(value = "The number of items to skip before returning the results", allowableValues = "") @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1) @Max(100) @ApiParam(value = "The number of items to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Check Possible Start Shipment", nickname = "pmmProductsPossibleShipmentStartProductIdGet", notes = "", response = Boolean.class, tags={ "Product Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Check Result", response = Boolean.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/pmm/products/possibleShipmentStart/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> pmmProductsPossibleShipmentStartProductIdGet(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId);


    @ApiOperation(value = "Create product information", nickname = "pmmProductsPost", notes = "", response = ProductModel.class, tags={ "Product Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created an product", response = ProductModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/pmm/products",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ProductModel> pmmProductsPost(@ApiParam(value = ""  )  @Valid @RequestBody ProductModel body);


    @ApiOperation(value = "Detail product information", nickname = "pmmProductsProductIdGet", notes = "", response = ProductModel.class, tags={ "Product Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned an product", response = ProductModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/pmm/products/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProductModel> pmmProductsProductIdGet(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId);


    @ApiOperation(value = "Update product infromation", nickname = "pmmProductsProductIdPut", notes = "", response = ProductModel.class, tags={ "Product Module", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated an product", response = ProductModel.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorModel.class) })
    @RequestMapping(value = "/pmm/products/{productId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ProductModel> pmmProductsProductIdPut(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId,@ApiParam(value = ""  )  @Valid @RequestBody ProductModel body);

}
