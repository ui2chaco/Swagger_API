package io.swagger.api;

import io.swagger.model.ErrorModel;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.OrderModel;
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
public class OmmApiController implements OmmApi {

    private static final Logger log = LoggerFactory.getLogger(OmmApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OmmApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<OrderModel>> ommOrdersGet(@Min(1)@ApiParam(value = "The number of items to skip before returning the results", allowableValues = "") @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(1) @Max(100) @ApiParam(value = "The number of items to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "From Order Date") @Valid @RequestParam(value = "odf", required = false) OffsetDateTime odf,@ApiParam(value = "To Order Date") @Valid @RequestParam(value = "odt", required = false) OffsetDateTime odt,@ApiParam(value = "Minimum Order Amount") @Valid @RequestParam(value = "oaf", required = false) Double oaf,@ApiParam(value = "Maximum Order Amount") @Valid @RequestParam(value = "oat", required = false) Double oat,@ApiParam(value = "Customize Search Parameters") @Valid @RequestParam(value = "csp", required = false) String csp,@ApiParam(value = "Test Parameter") @Valid @RequestParam(value = "tp1", required = false) String tp1) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrderModel>>(objectMapper.readValue("[ {\n  \"orderAmount\" : 6.027456183070403,\n  \"orderId\" : \"orderId\",\n  \"customerId\" : \"customerId\",\n  \"orderStatus\" : \"orderStatus\",\n  \"shipFee\" : 1.4658129805029452,\n  \"paymentAmount\" : 0.8008281904610115,\n  \"orderDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentStatus\" : \"paymentStatus\",\n  \"shipmentStatus\" : \"shipmentStatus\"\n}, {\n  \"orderAmount\" : 6.027456183070403,\n  \"orderId\" : \"orderId\",\n  \"customerId\" : \"customerId\",\n  \"orderStatus\" : \"orderStatus\",\n  \"shipFee\" : 1.4658129805029452,\n  \"paymentAmount\" : 0.8008281904610115,\n  \"orderDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentStatus\" : \"paymentStatus\",\n  \"shipmentStatus\" : \"shipmentStatus\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrderModel>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrderModel>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderModel> ommOrdersOrderIdGet(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderModel>(objectMapper.readValue("{\n  \"orderAmount\" : 6.027456183070403,\n  \"orderId\" : \"orderId\",\n  \"customerId\" : \"customerId\",\n  \"orderStatus\" : \"orderStatus\",\n  \"shipFee\" : 1.4658129805029452,\n  \"paymentAmount\" : 0.8008281904610115,\n  \"orderDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentStatus\" : \"paymentStatus\",\n  \"shipmentStatus\" : \"shipmentStatus\"\n}", OrderModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderModel> ommOrdersOrderIdPut(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = ""  )  @Valid @RequestBody OrderModel body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderModel>(objectMapper.readValue("{\n  \"orderAmount\" : 6.027456183070403,\n  \"orderId\" : \"orderId\",\n  \"customerId\" : \"customerId\",\n  \"orderStatus\" : \"orderStatus\",\n  \"shipFee\" : 1.4658129805029452,\n  \"paymentAmount\" : 0.8008281904610115,\n  \"orderDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentStatus\" : \"paymentStatus\",\n  \"shipmentStatus\" : \"shipmentStatus\"\n}", OrderModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> ommOrdersOrderIdStatusOrderStatusPatch(@ApiParam(value = "注文ID",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "注文状態",required=true) @PathVariable("orderStatus") String orderStatus) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OrderModel> ommOrdersPost(@ApiParam(value = ""  )  @Valid @RequestBody OrderModel body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OrderModel>(objectMapper.readValue("{\n  \"orderAmount\" : 6.027456183070403,\n  \"orderId\" : \"orderId\",\n  \"customerId\" : \"customerId\",\n  \"orderStatus\" : \"orderStatus\",\n  \"shipFee\" : 1.4658129805029452,\n  \"paymentAmount\" : 0.8008281904610115,\n  \"orderDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentStatus\" : \"paymentStatus\",\n  \"shipmentStatus\" : \"shipmentStatus\"\n}", OrderModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OrderModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OrderModel>(HttpStatus.NOT_IMPLEMENTED);
    }

}
