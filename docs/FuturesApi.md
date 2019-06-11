# FuturesApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFuturesOrder**](FuturesApi.md#cancelFuturesOrder) | **DELETE** /futures/orders/{order_id} | Cancel a single order
[**cancelFuturesOrders**](FuturesApi.md#cancelFuturesOrders) | **DELETE** /futures/orders | Cancel all &#x60;open&#x60; orders matched
[**cancelPriceTriggeredOrder**](FuturesApi.md#cancelPriceTriggeredOrder) | **DELETE** /futures/price_orders/{order_id} | Cancel a single order
[**cancelPriceTriggeredOrderList**](FuturesApi.md#cancelPriceTriggeredOrderList) | **DELETE** /futures/price_orders | Cancel all open orders
[**createFuturesOrder**](FuturesApi.md#createFuturesOrder) | **POST** /futures/orders | Create a futures order
[**createPriceTriggeredOrder**](FuturesApi.md#createPriceTriggeredOrder) | **POST** /futures/price_orders | Create a price-triggered order
[**getFuturesContract**](FuturesApi.md#getFuturesContract) | **GET** /futures/contracts/{contract} | Get a single contract
[**getFuturesOrder**](FuturesApi.md#getFuturesOrder) | **GET** /futures/orders/{order_id} | Get a single order
[**getMyTrades**](FuturesApi.md#getMyTrades) | **GET** /futures/my_trades | List personal trading history
[**getPosition**](FuturesApi.md#getPosition) | **GET** /futures/positions/{contract} | Get single position
[**getPriceTriggeredOrder**](FuturesApi.md#getPriceTriggeredOrder) | **GET** /futures/price_orders/{order_id} | Get a single order
[**listFuturesAccountBook**](FuturesApi.md#listFuturesAccountBook) | **GET** /futures/account_book | Query account book
[**listFuturesAccounts**](FuturesApi.md#listFuturesAccounts) | **GET** /futures/accounts | Query futures account
[**listFuturesCandlesticks**](FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/candlesticks | Get futures candlesticks
[**listFuturesContracts**](FuturesApi.md#listFuturesContracts) | **GET** /futures/contracts | List all futures contracts
[**listFuturesFundingRateHistory**](FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/funding_rate | Funding rate history
[**listFuturesInsuranceLedger**](FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/insurance | Futures insurance balance history
[**listFuturesOrderBook**](FuturesApi.md#listFuturesOrderBook) | **GET** /futures/order_book | Futures order book
[**listFuturesOrders**](FuturesApi.md#listFuturesOrders) | **GET** /futures/orders | List futures orders
[**listFuturesTickers**](FuturesApi.md#listFuturesTickers) | **GET** /futures/tickers | List futures tickers
[**listFuturesTrades**](FuturesApi.md#listFuturesTrades) | **GET** /futures/trades | Futures trading history
[**listLiquidates**](FuturesApi.md#listLiquidates) | **GET** /futures/liquidates | List liquidation history
[**listPositionClose**](FuturesApi.md#listPositionClose) | **GET** /futures/position_close | List position close history
[**listPositions**](FuturesApi.md#listPositions) | **GET** /futures/positions | List all positions of a user
[**listPriceTriggeredOrders**](FuturesApi.md#listPriceTriggeredOrders) | **GET** /futures/price_orders | List all auto orders
[**updatePositionLeverage**](FuturesApi.md#updatePositionLeverage) | **POST** /futures/positions/{contract}/leverage | Update position leverage
[**updatePositionMargin**](FuturesApi.md#updatePositionMargin) | **POST** /futures/positions/{contract}/margin | Update position margin
[**updatePositionRiskLimit**](FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/positions/{contract}/risk_limit | Update position risk limit


<a name="cancelFuturesOrder"></a>
# **cancelFuturesOrder**
> FuturesOrder cancelFuturesOrder(orderId)

Cancel a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String orderId = "12345"; // String | ID returned on order successfully being created
try {
    FuturesOrder result = apiInstance.cancelFuturesOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelFuturesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelFuturesOrders"></a>
# **cancelFuturesOrders**
> List&lt;FuturesOrder&gt; cancelFuturesOrders(contract, side)

Cancel all &#x60;open&#x60; orders matched

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
String side = "ask"; // String | All bids or asks. Both included in not specified
try {
    List<FuturesOrder> result = apiInstance.cancelFuturesOrders(contract, side);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelFuturesOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **side** | **String**| All bids or asks. Both included in not specified | [optional] [enum: ask, bid]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelPriceTriggeredOrder"></a>
# **cancelPriceTriggeredOrder**
> FuturesPriceTriggeredOrder cancelPriceTriggeredOrder(orderId)

Cancel a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String orderId = "orderId_example"; // String | ID returned on order successfully being created
try {
    FuturesPriceTriggeredOrder result = apiInstance.cancelPriceTriggeredOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelPriceTriggeredOrderList"></a>
# **cancelPriceTriggeredOrderList**
> List&lt;FuturesPriceTriggeredOrder&gt; cancelPriceTriggeredOrderList(contract)

Cancel all open orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
try {
    List<FuturesPriceTriggeredOrder> result = apiInstance.cancelPriceTriggeredOrderList(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFuturesOrder"></a>
# **createFuturesOrder**
> FuturesOrder createFuturesOrder(futuresOrder)

Create a futures order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
FuturesOrder futuresOrder = new FuturesOrder(); // FuturesOrder | 
try {
    FuturesOrder result = apiInstance.createFuturesOrder(futuresOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#createFuturesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **futuresOrder** | [**FuturesOrder**](FuturesOrder.md)|  |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPriceTriggeredOrder"></a>
# **createPriceTriggeredOrder**
> TriggerOrderResponse createPriceTriggeredOrder(futuresPriceTriggeredOrder)

Create a price-triggered order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = new FuturesPriceTriggeredOrder(); // FuturesPriceTriggeredOrder | 
try {
    TriggerOrderResponse result = apiInstance.createPriceTriggeredOrder(futuresPriceTriggeredOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#createPriceTriggeredOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **futuresPriceTriggeredOrder** | [**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)|  |

### Return type

[**TriggerOrderResponse**](TriggerOrderResponse.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFuturesContract"></a>
# **getFuturesContract**
> Contract getFuturesContract(contract)

Get a single contract

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract
try {
    Contract result = apiInstance.getFuturesContract(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getFuturesContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |

### Return type

[**Contract**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFuturesOrder"></a>
# **getFuturesOrder**
> FuturesOrder getFuturesOrder(orderId)

Get a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String orderId = "12345"; // String | ID returned on order successfully being created
try {
    FuturesOrder result = apiInstance.getFuturesOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getFuturesOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMyTrades"></a>
# **getMyTrades**
> List&lt;MyFuturesTrade&gt; getMyTrades(contract, order, limit, lastId)

List personal trading history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
Integer order = 12345; // Integer | Futures order ID, return related data only if specified
Integer limit = 100; // Integer | Maximum number of record returned in one list
String lastId = "12345"; // String | Specify list staring point using the last record of `id` in previous list-query results
try {
    List<MyFuturesTrade> result = apiInstance.getMyTrades(contract, order, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getMyTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **order** | **Integer**| Futures order ID, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the last record of &#x60;id&#x60; in previous list-query results | [optional]

### Return type

[**List&lt;MyFuturesTrade&gt;**](MyFuturesTrade.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPosition"></a>
# **getPosition**
> Position getPosition(contract)

Get single position

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
try {
    Position result = apiInstance.getPosition(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPriceTriggeredOrder"></a>
# **getPriceTriggeredOrder**
> FuturesPriceTriggeredOrder getPriceTriggeredOrder(orderId)

Get a single order

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String orderId = "orderId_example"; // String | ID returned on order successfully being created
try {
    FuturesPriceTriggeredOrder result = apiInstance.getPriceTriggeredOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#getPriceTriggeredOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID returned on order successfully being created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesAccountBook"></a>
# **listFuturesAccountBook**
> List&lt;FuturesAccountBook&gt; listFuturesAccountBook(limit, from, to, type)

Query account book

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer from = 1547706332; // Integer | Start timestamp
Integer to = 1547706332; // Integer | End timestamp
String type = "dnw"; // String | Changing Type: - dnw: Deposit & Withdraw - pnl: Profit & Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit & Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate
try {
    List<FuturesAccountBook> result = apiInstance.listFuturesAccountBook(limit, from, to, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesAccountBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **from** | **Integer**| Start timestamp | [optional]
 **to** | **Integer**| End timestamp | [optional]
 **type** | **String**| Changing Type: - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: POINT Deposit &amp; Withdraw - point_fee: POINT Trading fee - point_refr: POINT Referrer rebate | [optional] [enum: dnw, pnl, fee, refr, fund, point_dnw, point_fee, point_refr]

### Return type

[**List&lt;FuturesAccountBook&gt;**](FuturesAccountBook.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesAccounts"></a>
# **listFuturesAccounts**
> FuturesAccount listFuturesAccounts()

Query futures account

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
try {
    FuturesAccount result = apiInstance.listFuturesAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesCandlesticks"></a>
# **listFuturesCandlesticks**
> List&lt;FuturesCandlestick&gt; listFuturesCandlesticks(contract, from, to, limit, interval)

Get futures candlesticks

Return specified contract candlesticks. If prefix &#x60;contract&#x60; with &#x60;mark_&#x60;, the contract&#39;s mark price candlesticks are returned; if prefix with &#x60;index_&#x60;, index price candlesticks will be returned.  Maximum of 2000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract
BigDecimal from = new BigDecimal(); // BigDecimal | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
BigDecimal to = new BigDecimal(); // BigDecimal | End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time
Integer limit = 100; // Integer | Maximum recent data points returned. `limit` is conflicted with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
String interval = "5m"; // String | Interval time between data points
try {
    List<FuturesCandlestick> result = apiInstance.listFuturesCandlesticks(contract, from, to, limit, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesCandlesticks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **from** | **BigDecimal**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **BigDecimal**| End time of candlesticks, formatted in Unix timestamp in seconds. Default to current time | [optional]
 **limit** | **Integer**| Maximum recent data points returned. &#x60;limit&#x60; is conflicted with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Interval time between data points | [optional] [default to 5m] [enum: 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]

### Return type

[**List&lt;FuturesCandlestick&gt;**](FuturesCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesContracts"></a>
# **listFuturesContracts**
> List&lt;Contract&gt; listFuturesContracts()

List all futures contracts

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
try {
    List<Contract> result = apiInstance.listFuturesContracts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesContracts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesFundingRateHistory"></a>
# **listFuturesFundingRateHistory**
> List&lt;FundingRateRecord&gt; listFuturesFundingRateHistory(contract, limit)

Funding rate history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of record returned in one list
try {
    List<FundingRateRecord> result = apiInstance.listFuturesFundingRateHistory(contract, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesFundingRateHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]

### Return type

[**List&lt;FundingRateRecord&gt;**](FundingRateRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesInsuranceLedger"></a>
# **listFuturesInsuranceLedger**
> List&lt;InsuranceRecord&gt; listFuturesInsuranceLedger(limit)

Futures insurance balance history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
Integer limit = 100; // Integer | Maximum number of record returned in one list
try {
    List<InsuranceRecord> result = apiInstance.listFuturesInsuranceLedger(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesInsuranceLedger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]

### Return type

[**List&lt;InsuranceRecord&gt;**](InsuranceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesOrderBook"></a>
# **listFuturesOrderBook**
> FuturesOrderBook listFuturesOrderBook(contract, interval, limit)

Futures order book

Bids will be sorted by price from high to low, while asks sorted reversely

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract
String interval = "0"; // String | Order depth. 0 means no aggregation is applied. default to 0
Integer limit = 10; // Integer | Maximum number of order depth data in asks or bids
try {
    FuturesOrderBook result = apiInstance.listFuturesOrderBook(contract, interval, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesOrderBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **interval** | **String**| Order depth. 0 means no aggregation is applied. default to 0 | [optional] [default to 0] [enum: 0, 0.1, 0.01]
 **limit** | **Integer**| Maximum number of order depth data in asks or bids | [optional] [default to 10]

### Return type

[**FuturesOrderBook**](FuturesOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesOrders"></a>
# **listFuturesOrders**
> List&lt;FuturesOrder&gt; listFuturesOrders(contract, status, limit, lastId)

List futures orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
String status = "open"; // String | List orders based on status
Integer limit = 100; // Integer | Maximum number of record returned in one list
String lastId = "12345"; // String | Specify list staring point using the last record of `id` in previous list-query results
try {
    List<FuturesOrder> result = apiInstance.listFuturesOrders(contract, status, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **status** | **String**| List orders based on status | [enum: open, finished]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the last record of &#x60;id&#x60; in previous list-query results | [optional]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesTickers"></a>
# **listFuturesTickers**
> List&lt;FuturesTicker&gt; listFuturesTickers(contract)

List futures tickers

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
try {
    List<FuturesTicker> result = apiInstance.listFuturesTickers(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesTickers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**List&lt;FuturesTicker&gt;**](FuturesTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFuturesTrades"></a>
# **listFuturesTrades**
> List&lt;FuturesTrade&gt; listFuturesTrades(contract, limit, lastId)

Futures trading history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

FuturesApi apiInstance = new FuturesApi();
String contract = "BTC_USD"; // String | Futures contract
Integer limit = 100; // Integer | Maximum number of record returned in one list
String lastId = "12345"; // String | Specify list staring point using the last record of `id` in previous list-query results
try {
    List<FuturesTrade> result = apiInstance.listFuturesTrades(contract, limit, lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listFuturesTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **lastId** | **String**| Specify list staring point using the last record of &#x60;id&#x60; in previous list-query results | [optional]

### Return type

[**List&lt;FuturesTrade&gt;**](FuturesTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLiquidates"></a>
# **listLiquidates**
> List&lt;FuturesLiquidate&gt; listLiquidates(contract, limit, at)

List liquidation history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer at = 0; // Integer | Specify a liquidation timestamp
try {
    List<FuturesLiquidate> result = apiInstance.listLiquidates(contract, limit, at);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listLiquidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **at** | **Integer**| Specify a liquidation timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesLiquidate&gt;**](FuturesLiquidate.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPositionClose"></a>
# **listPositionClose**
> List&lt;PositionClose&gt; listPositionClose(contract, limit)

List position close history

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
Integer limit = 100; // Integer | Maximum number of record returned in one list
try {
    List<PositionClose> result = apiInstance.listPositionClose(contract, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listPositionClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]

### Return type

[**List&lt;PositionClose&gt;**](PositionClose.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPositions"></a>
# **listPositions**
> List&lt;Position&gt; listPositions()

List all positions of a user

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
try {
    List<Position> result = apiInstance.listPositions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listPositions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPriceTriggeredOrders"></a>
# **listPriceTriggeredOrders**
> List&lt;FuturesPriceTriggeredOrder&gt; listPriceTriggeredOrders(status, contract, limit, offset)

List all auto orders

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String status = "status_example"; // String | List orders based on status
String contract = "BTC_USD"; // String | Futures contract, return related data only if specified
Integer limit = 100; // Integer | Maximum number of record returned in one list
Integer offset = 0; // Integer | List offset, starting from 0
try {
    List<FuturesPriceTriggeredOrder> result = apiInstance.listPriceTriggeredOrders(status, contract, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#listPriceTriggeredOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| List orders based on status | [enum: open, finished]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of record returned in one list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionLeverage"></a>
# **updatePositionLeverage**
> Position updatePositionLeverage(contract, leverage)

Update position leverage

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
String leverage = "10"; // String | New position leverage
try {
    Position result = apiInstance.updatePositionLeverage(contract, leverage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **leverage** | **String**| New position leverage |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionMargin"></a>
# **updatePositionMargin**
> Position updatePositionMargin(contract, change)

Update position margin

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
String change = "0.01"; // String | Margin change. Use positive number to increase margin, negative number otherwise.
try {
    Position result = apiInstance.updatePositionMargin(contract, change);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change. Use positive number to increase margin, negative number otherwise. |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePositionRiskLimit"></a>
# **updatePositionRiskLimit**
> Position updatePositionRiskLimit(contract, riskLimit)

Update position risk limit

### Example

```java
import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
// uncomment the next line if testing the API with other host
// apiClient.setBasePath("https://some-other-host");
FuturesApi apiInstance = new FuturesApi(client);
String contract = "BTC_USD"; // String | Futures contract
String riskLimit = "10"; // String | New position risk limit
try {
    Position result = apiInstance.updatePositionRiskLimit(contract, riskLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FuturesApi#updatePositionRiskLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New position risk limit |

### Return type

[**Position**](Position.md)

### Authorization

Authentication with API key and secret is required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

