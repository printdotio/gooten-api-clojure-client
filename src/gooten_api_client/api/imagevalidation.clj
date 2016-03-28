(ns gooten-api-client.api.imagevalidation
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-imagevalidation-with-http-info
  "Submit image validation
  Validates an images and returns a validation errors (if available)."
  [req ]
  (call-api "/imagevalidation/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    req
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-imagevalidation
  "Submit image validation
  Validates an images and returns a validation errors (if available)."
  [req ]
  (:data (p-ost-imagevalidation-with-http-info req)))
