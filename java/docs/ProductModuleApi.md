# ProductModuleApi

All URIs are relative to *https://virtserver.swaggerhub.com/june.h/sfcc_oms_smpl/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pmmProductsGet**](ProductModuleApi.md#pmmProductsGet) | **GET** /pmm/products | Search product information
[**pmmProductsPossibleShipmentStartProductIdGet**](ProductModuleApi.md#pmmProductsPossibleShipmentStartProductIdGet) | **GET** /pmm/products/possibleShipmentStart/{productId} | Check Possible Start Shipment
[**pmmProductsPost**](ProductModuleApi.md#pmmProductsPost) | **POST** /pmm/products | Create product information
[**pmmProductsProductIdGet**](ProductModuleApi.md#pmmProductsProductIdGet) | **GET** /pmm/products/{productId} | Detail product information
[**pmmProductsProductIdPut**](ProductModuleApi.md#pmmProductsProductIdPut) | **PUT** /pmm/products/{productId} | Update product infromation

<a name="pmmProductsGet"></a>
# **pmmProductsGet**
> List&lt;ProductModel&gt; pmmProductsGet(offset, limit)

Search product information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductModuleApi;


ProductModuleApi apiInstance = new ProductModuleApi();
Integer offset = 56; // Integer | The number of items to skip before returning the results
Integer limit = 56; // Integer | The number of items to return
try {
    List<ProductModel> result = apiInstance.pmmProductsGet(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductModuleApi#pmmProductsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| The number of items to skip before returning the results | [optional] [enum: ]
 **limit** | **Integer**| The number of items to return | [optional] [enum: ]

### Return type

[**List&lt;ProductModel&gt;**](ProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pmmProductsPossibleShipmentStartProductIdGet"></a>
# **pmmProductsPossibleShipmentStartProductIdGet**
> Boolean pmmProductsPossibleShipmentStartProductIdGet(productId)

Check Possible Start Shipment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductModuleApi;


ProductModuleApi apiInstance = new ProductModuleApi();
String productId = "productId_example"; // String | 商品ID
try {
    Boolean result = apiInstance.pmmProductsPossibleShipmentStartProductIdGet(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductModuleApi#pmmProductsPossibleShipmentStartProductIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| 商品ID |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pmmProductsPost"></a>
# **pmmProductsPost**
> ProductModel pmmProductsPost(body)

Create product information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductModuleApi;


ProductModuleApi apiInstance = new ProductModuleApi();
ProductModel body = new ProductModel(); // ProductModel | 
try {
    ProductModel result = apiInstance.pmmProductsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductModuleApi#pmmProductsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProductModel**](ProductModel.md)|  | [optional]

### Return type

[**ProductModel**](ProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pmmProductsProductIdGet"></a>
# **pmmProductsProductIdGet**
> ProductModel pmmProductsProductIdGet(productId)

Detail product information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductModuleApi;


ProductModuleApi apiInstance = new ProductModuleApi();
String productId = "productId_example"; // String | 商品ID
try {
    ProductModel result = apiInstance.pmmProductsProductIdGet(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductModuleApi#pmmProductsProductIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| 商品ID |

### Return type

[**ProductModel**](ProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pmmProductsProductIdPut"></a>
# **pmmProductsProductIdPut**
> ProductModel pmmProductsProductIdPut(productId, body)

Update product infromation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductModuleApi;


ProductModuleApi apiInstance = new ProductModuleApi();
String productId = "productId_example"; // String | 商品ID
ProductModel body = new ProductModel(); // ProductModel | 
try {
    ProductModel result = apiInstance.pmmProductsProductIdPut(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductModuleApi#pmmProductsProductIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| 商品ID |
 **body** | [**ProductModel**](ProductModel.md)|  | [optional]

### Return type

[**ProductModel**](ProductModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

