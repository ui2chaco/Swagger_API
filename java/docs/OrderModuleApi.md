# OrderModuleApi

All URIs are relative to *https://virtserver.swaggerhub.com/june.h/sfcc_oms_smpl/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ommOrdersGet**](OrderModuleApi.md#ommOrdersGet) | **GET** /omm/orders | Search order information
[**ommOrdersOrderIdGet**](OrderModuleApi.md#ommOrdersOrderIdGet) | **GET** /omm/orders/{orderId} | Detail order information
[**ommOrdersOrderIdPut**](OrderModuleApi.md#ommOrdersOrderIdPut) | **PUT** /omm/orders/{orderId} | Update order infromation
[**ommOrdersOrderIdStatusOrderStatusPatch**](OrderModuleApi.md#ommOrdersOrderIdStatusOrderStatusPatch) | **PATCH** /omm/orders/{orderId}/status/{orderStatus} | Update order status
[**ommOrdersPost**](OrderModuleApi.md#ommOrdersPost) | **POST** /omm/orders | Create order information

<a name="ommOrdersGet"></a>
# **ommOrdersGet**
> List&lt;OrderModel&gt; ommOrdersGet(offset, limit, odf, odt, oaf, oat, csp, tp1)

Search order information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderModuleApi;


OrderModuleApi apiInstance = new OrderModuleApi();
Integer offset = 56; // Integer | The number of items to skip before returning the results
Integer limit = 56; // Integer | The number of items to return
OffsetDateTime odf = new OffsetDateTime(); // OffsetDateTime | From Order Date
OffsetDateTime odt = new OffsetDateTime(); // OffsetDateTime | To Order Date
Double oaf = 3.4D; // Double | Minimum Order Amount
Double oat = 3.4D; // Double | Maximum Order Amount
String csp = "csp_example"; // String | Customize Search Parameters
String tp1 = "tp1_example"; // String | Test Parameter
try {
    List<OrderModel> result = apiInstance.ommOrdersGet(offset, limit, odf, odt, oaf, oat, csp, tp1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderModuleApi#ommOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| The number of items to skip before returning the results | [optional] [enum: ]
 **limit** | **Integer**| The number of items to return | [optional] [enum: ]
 **odf** | **OffsetDateTime**| From Order Date | [optional]
 **odt** | **OffsetDateTime**| To Order Date | [optional]
 **oaf** | **Double**| Minimum Order Amount | [optional]
 **oat** | **Double**| Maximum Order Amount | [optional]
 **csp** | **String**| Customize Search Parameters | [optional]
 **tp1** | **String**| Test Parameter | [optional]

### Return type

[**List&lt;OrderModel&gt;**](OrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ommOrdersOrderIdGet"></a>
# **ommOrdersOrderIdGet**
> OrderModel ommOrdersOrderIdGet(orderId)

Detail order information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderModuleApi;


OrderModuleApi apiInstance = new OrderModuleApi();
String orderId = "orderId_example"; // String | 注文ID
try {
    OrderModel result = apiInstance.ommOrdersOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderModuleApi#ommOrdersOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| 注文ID |

### Return type

[**OrderModel**](OrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ommOrdersOrderIdPut"></a>
# **ommOrdersOrderIdPut**
> OrderModel ommOrdersOrderIdPut(orderId, body)

Update order infromation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderModuleApi;


OrderModuleApi apiInstance = new OrderModuleApi();
String orderId = "orderId_example"; // String | 注文ID
OrderModel body = new OrderModel(); // OrderModel | 
try {
    OrderModel result = apiInstance.ommOrdersOrderIdPut(orderId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderModuleApi#ommOrdersOrderIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| 注文ID |
 **body** | [**OrderModel**](OrderModel.md)|  | [optional]

### Return type

[**OrderModel**](OrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ommOrdersOrderIdStatusOrderStatusPatch"></a>
# **ommOrdersOrderIdStatusOrderStatusPatch**
> ommOrdersOrderIdStatusOrderStatusPatch(orderId, orderStatus)

Update order status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderModuleApi;


OrderModuleApi apiInstance = new OrderModuleApi();
String orderId = "orderId_example"; // String | 注文ID
String orderStatus = "orderStatus_example"; // String | 注文状態
try {
    apiInstance.ommOrdersOrderIdStatusOrderStatusPatch(orderId, orderStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderModuleApi#ommOrdersOrderIdStatusOrderStatusPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| 注文ID |
 **orderStatus** | **String**| 注文状態 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ommOrdersPost"></a>
# **ommOrdersPost**
> OrderModel ommOrdersPost(body)

Create order information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderModuleApi;


OrderModuleApi apiInstance = new OrderModuleApi();
OrderModel body = new OrderModel(); // OrderModel | 
try {
    OrderModel result = apiInstance.ommOrdersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderModuleApi#ommOrdersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderModel**](OrderModel.md)|  | [optional]

### Return type

[**OrderModel**](OrderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

