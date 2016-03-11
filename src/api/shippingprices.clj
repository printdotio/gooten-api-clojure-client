(ns .api.shippingprices
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-shippingprices-with-http-info
  "Get a list of shipping options and prices for items
  Get a list of shipping options and prices for items."
  [shipping-prices-request ]
  (call-api "/shippingprices/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    shipping-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-shippingprices
  "Get a list of shipping options and prices for items
  Get a list of shipping options and prices for items."
  [shipping-prices-request ]
  (:data (p-ost-shippingprices-with-http-info shipping-prices-request)))
