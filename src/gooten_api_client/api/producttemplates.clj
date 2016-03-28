(ns gooten-api-client.api.producttemplates
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-producttemplates-with-http-info
  "Get a list of product templates
  Get a list of product templates."
  ([sku ] (get-producttemplates-with-http-info sku nil))
  ([sku {:keys [language-code ]}]
   (call-api "/producttemplates/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sku" sku "languageCode" language-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-producttemplates
  "Get a list of product templates
  Get a list of product templates."
  ([sku ] (get-producttemplates sku nil))
  ([sku optional-params]
   (:data (get-producttemplates-with-http-info sku optional-params))))
