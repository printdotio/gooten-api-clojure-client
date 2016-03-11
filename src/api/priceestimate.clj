(ns .api.priceestimate
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-priceestimate-with-http-info
  "Get an order price
  Get the price of an order, including discounts from a coupon."
  [order version source ]
  (call-api "/priceestimate/v/{version}/source/{source}/" :post
            {:path-params   {"version" version "source" source }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-priceestimate
  "Get an order price
  Get the price of an order, including discounts from a coupon."
  [order version source ]
  (:data (p-ost-priceestimate-with-http-info order version source)))
