(ns .api.products
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-products-with-http-info
  "Get a list of products
  Get a list of products. The products returned may have variants. Products returned are only those within the overall recipe. All images returned from the service are dynamically resizable by adding width and height querystrings."
  ([country-code version source ] (get-products-with-http-info country-code version source nil))
  ([country-code version source {:keys [all language-code currency-code ]}]
   (call-api "/products/v/{version}/source/{source}/" :get
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"countryCode" country-code "all" all "languageCode" language-code "currencyCode" currency-code }
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
