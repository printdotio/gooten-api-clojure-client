(ns gooten-api-client.api.shippriceestimate
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-shippriceestimate-with-http-info
  "Get a baseline ship price for an item
  Price returned is an estimate which may or may not be realistically attainable."
  ([product-id country-code ] (get-shippriceestimate-with-http-info product-id country-code nil))
  ([product-id country-code {:keys [currency-code ]}]
   (call-api "/shippriceestimate/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"productId" product-id "countryCode" country-code "currencyCode" currency-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-shippriceestimate
  "Get a baseline ship price for an item
  Price returned is an estimate which may or may not be realistically attainable."
  ([product-id country-code ] (get-shippriceestimate product-id country-code nil))
  ([product-id country-code optional-params]
   (:data (get-shippriceestimate-with-http-info product-id country-code optional-params))))
