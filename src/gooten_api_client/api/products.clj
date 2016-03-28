(ns gooten-api-client.api.products
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-products-with-http-info
  "Get a list of products
  Get a list of products. The products returned may have variants. Products returned are only those within the overall recipe. All images returned from the service are dynamically resizable by adding width and height querystrings."
  ([country-code version source ] (get-products-with-http-info country-code version source nil))
  ([country-code version source {:keys [partner-billing-key all language-code currency-code ]}]
   (call-api "/v/{version}/source/{source}/products/" :get
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"partnerBillingKey" partner-billing-key "countryCode" country-code "all" all "languageCode" language-code "currencyCode" currency-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-products
  "Get a list of products
  Get a list of products. The products returned may have variants. Products returned are only those within the overall recipe. All images returned from the service are dynamically resizable by adding width and height querystrings."
  ([country-code version source ] (get-products country-code version source nil))
  ([country-code version source optional-params]
   (:data (get-products-with-http-info country-code version source optional-params))))
