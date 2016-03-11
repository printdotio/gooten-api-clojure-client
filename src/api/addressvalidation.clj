(ns .api.addressvalidation
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn addressvalidation-with-http-info
  "Validates an address and returns a suggested address (if available) and a validation score.
  Validates an address and returns a suggested address (if available) and a validation score."
  ([] (addressvalidation-with-http-info nil))
  ([{:keys [line1 line2 city state postal-code country-code ]}]
   (call-api "/addressvalidation/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"line1" line1 "line2" line2 "city" city "state" state "postalCode" postal-code "countryCode" country-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn addressvalidation
  "Validates an address and returns a suggested address (if available) and a validation score.
  Validates an address and returns a suggested address (if available) and a validation score."
  ([] (addressvalidation nil))
  ([optional-params]
   (:data (addressvalidation-with-http-info optional-params))))
