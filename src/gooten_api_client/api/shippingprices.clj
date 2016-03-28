(ns gooten-api-client.api.shippingprices
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-shippingprices-with-http-info
  "Get a list of shipping options and prices for items
  Get a list of shipping options and prices for items."
  ([shipping-prices-request ] (p-ost-shippingprices-with-http-info shipping-prices-request nil))
  ([shipping-prices-request {:keys [partner-billing-key ]}]
   (call-api "/shippingprices/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"partnerBillingKey" partner-billing-key }
              :form-params   {}
              :body-param    shipping-prices-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn p-ost-shippingprices
  "Get a list of shipping options and prices for items
  Get a list of shipping options and prices for items."
  ([shipping-prices-request ] (p-ost-shippingprices shipping-prices-request nil))
  ([shipping-prices-request optional-params]
   (:data (p-ost-shippingprices-with-http-info shipping-prices-request optional-params))))
