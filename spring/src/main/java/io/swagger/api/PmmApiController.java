package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.ProductModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-08T07:59:24.757Z[GMT]")
@Controller
public class PmmApiController implements PmmApi {

    private static final Logger log = LoggerFactory.getLogger(PmmApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PmmApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ProductModel>> pmmProductsGet(@Min(1)@ApiParam(value = "The number of items to skip before returning the results", allowableValues = "") @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1) @Max(100) @ApiParam(value = "The number of items to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductModel>>(objectMapper.readValue("[ {\n  \"saleStartDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"productId\" : \"productId\",\n  \"name\" : \"name\",\n  \"productType\" : \"productType\",\n  \"saleEndDt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"saleStartDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"productId\" : \"productId\",\n  \"name\" : \"name\",\n  \"productType\" : \"productType\",\n  \"saleEndDt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductModel>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductModel>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> pmmProductsPossibleShipmentStartProductIdGet(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductModel> pmmProductsPost(@ApiParam(value = ""  )  @Valid @RequestBody ProductModel body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductModel>(objectMapper.readValue("{\n  \"saleStartDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"productId\" : \"productId\",\n  \"name\" : \"name\",\n  \"productType\" : \"productType\",\n  \"saleEndDt\" : \"2000-01-23T04:56:07.000+00:00\"\n}", ProductModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductModel> pmmProductsProductIdGet(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductModel>(objectMapper.readValue("{\n  \"saleStartDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"productId\" : \"productId\",\n  \"name\" : \"name\",\n  \"productType\" : \"productType\",\n  \"saleEndDt\" : \"2000-01-23T04:56:07.000+00:00\"\n}", ProductModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductModel> pmmProductsProductIdPut(@ApiParam(value = "商品ID",required=true) @PathVariable("productId") String productId,@ApiParam(value = ""  )  @Valid @RequestBody ProductModel body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductModel>(objectMapper.readValue("{\n  \"saleStartDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdDt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"productId\" : \"productId\",\n  \"name\" : \"name\",\n  \"productType\" : \"productType\",\n  \"saleEndDt\" : \"2000-01-23T04:56:07.000+00:00\"\n}", ProductModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductModel>(HttpStatus.NOT_IMPLEMENTED);
    }

}
