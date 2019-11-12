# CommonApi

All URIs are relative to *https://virtserver.swaggerhub.com/june.h/sfcc_oms_smpl/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingGet**](CommonApi.md#pingGet) | **GET** /ping | Server example operation

<a name="pingGet"></a>
# **pingGet**
> pingGet()

Server example operation

This is an example operation to show how security is applied to the call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
try {
    apiInstance.pingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#pingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

