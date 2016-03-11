(ns .api.paymentvalidation
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn paymentvalidation-with-http-info
  "Submit payment validation for PayPal
  Submit payment validation for PayPal"
  [order-id pay-pal-key ]
  (call-api "/paymentvalidation/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"OrderId" order-id "PayPalKey" pay-pal-key }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn paymentvalidation
  "Submit payment validation for PayPal
  Submit payment validation for PayPal"
  [order-id pay-pal-key ]
  (:data (paymentvalidation-with-http-info order-id pay-pal-key)))
