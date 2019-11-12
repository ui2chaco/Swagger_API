package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 注文情報
 */
@ApiModel(description = "注文情報")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-12T08:42:37.055Z[GMT]")
public class OrderModel   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("shipmentStatus")
  private String shipmentStatus = null;

  @JsonProperty("paymentStatus")
  private String paymentStatus = null;

  @JsonProperty("paymentAmount")
  private Double paymentAmount = null;

  @JsonProperty("orderAmount")
  private Double orderAmount = null;

  @JsonProperty("shipFee")
  private Double shipFee = null;

  @JsonProperty("orderDate")
  private OffsetDateTime orderDate = null;

  public OrderModel orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * 注文ID(Key)
   * @return orderId
  **/
  @ApiModelProperty(value = "注文ID(Key)")
  
    public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderModel customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * 注文者ID
   * @return customerId
  **/
  @ApiModelProperty(value = "注文者ID")
  
    public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderModel orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * 注文状態コード
   * @return orderStatus
  **/
  @ApiModelProperty(value = "注文状態コード")
  
    public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderModel shipmentStatus(String shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

  /**
   * 出荷状態コード
   * @return shipmentStatus
  **/
  @ApiModelProperty(value = "出荷状態コード")
  
    public String getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(String shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public OrderModel paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * 決済状態コード
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "決済状態コード")
  
    public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public OrderModel paymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * 決済金額
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "決済金額")
  
    public Double getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public OrderModel orderAmount(Double orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

  /**
   * 注文金額
   * @return orderAmount
  **/
  @ApiModelProperty(value = "注文金額")
  
    public Double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Double orderAmount) {
    this.orderAmount = orderAmount;
  }

  public OrderModel shipFee(Double shipFee) {
    this.shipFee = shipFee;
    return this;
  }

  /**
   * 配送料
   * @return shipFee
  **/
  @ApiModelProperty(value = "配送料")
  
    public Double getShipFee() {
    return shipFee;
  }

  public void setShipFee(Double shipFee) {
    this.shipFee = shipFee;
  }

  public OrderModel orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * 注文日時
   * @return orderDate
  **/
  @ApiModelProperty(value = "注文日時")
  
    @Valid
    public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModel orderModel = (OrderModel) o;
    return Objects.equals(this.orderId, orderModel.orderId) &&
        Objects.equals(this.customerId, orderModel.customerId) &&
        Objects.equals(this.orderStatus, orderModel.orderStatus) &&
        Objects.equals(this.shipmentStatus, orderModel.shipmentStatus) &&
        Objects.equals(this.paymentStatus, orderModel.paymentStatus) &&
        Objects.equals(this.paymentAmount, orderModel.paymentAmount) &&
        Objects.equals(this.orderAmount, orderModel.orderAmount) &&
        Objects.equals(this.shipFee, orderModel.shipFee) &&
        Objects.equals(this.orderDate, orderModel.orderDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customerId, orderStatus, shipmentStatus, paymentStatus, paymentAmount, orderAmount, shipFee, orderDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModel {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    shipFee: ").append(toIndentedString(shipFee)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
