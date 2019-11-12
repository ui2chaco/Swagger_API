/*
 * Salesforce Commerce Cloud OMS
 * Salesforce Commerce Cloud OMS API test
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * 商品情報
 */
@Schema(description = "商品情報")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-12T08:45:31.599Z[GMT]")
public class ProductModel {
  @SerializedName("productId")
  private String productId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("productType")
  private String productType = null;

  @SerializedName("saleStartDt")
  private OffsetDateTime saleStartDt = null;

  @SerializedName("saleEndDt")
  private OffsetDateTime saleEndDt = null;

  @SerializedName("createdDt")
  private OffsetDateTime createdDt = null;

  public ProductModel productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID(Key)
   * @return productId
  **/
  @Schema(description = "商品ID(Key)")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 商品名
   * @return name
  **/
  @Schema(description = "商品名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductModel productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * 商品種別コード
   * @return productType
  **/
  @Schema(description = "商品種別コード")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ProductModel saleStartDt(OffsetDateTime saleStartDt) {
    this.saleStartDt = saleStartDt;
    return this;
  }

   /**
   * 販売開始日時
   * @return saleStartDt
  **/
  @Schema(description = "販売開始日時")
  public OffsetDateTime getSaleStartDt() {
    return saleStartDt;
  }

  public void setSaleStartDt(OffsetDateTime saleStartDt) {
    this.saleStartDt = saleStartDt;
  }

  public ProductModel saleEndDt(OffsetDateTime saleEndDt) {
    this.saleEndDt = saleEndDt;
    return this;
  }

   /**
   * 販売終了日時
   * @return saleEndDt
  **/
  @Schema(description = "販売終了日時")
  public OffsetDateTime getSaleEndDt() {
    return saleEndDt;
  }

  public void setSaleEndDt(OffsetDateTime saleEndDt) {
    this.saleEndDt = saleEndDt;
  }

  public ProductModel createdDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
    return this;
  }

   /**
   * 作成日時
   * @return createdDt
  **/
  @Schema(description = "作成日時")
  public OffsetDateTime getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductModel productModel = (ProductModel) o;
    return Objects.equals(this.productId, productModel.productId) &&
        Objects.equals(this.name, productModel.name) &&
        Objects.equals(this.productType, productModel.productType) &&
        Objects.equals(this.saleStartDt, productModel.saleStartDt) &&
        Objects.equals(this.saleEndDt, productModel.saleEndDt) &&
        Objects.equals(this.createdDt, productModel.createdDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, productType, saleStartDt, saleEndDt, createdDt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductModel {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    saleStartDt: ").append(toIndentedString(saleStartDt)).append("\n");
    sb.append("    saleEndDt: ").append(toIndentedString(saleEndDt)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
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
