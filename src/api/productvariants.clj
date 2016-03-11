(ns .api.productvariants
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-productvariants-with-http-info
  "Get a list of available product variations. Includes pricing information
  Get a list of all available product variations, or if one passes in a specific product type id (productId), gets a list of available variations of a recipe product."
  ([country-code product-id version source ] (get-productvariants-with-http-info country-code product-id version source nil))
  ([country-code product-id version source {:keys [all language-code currency-code ]}]
   (call-api "/productvariants/v/{version}/source/{source}/" :get
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"countryCode" country-code "productId" product-id "all" all "languageCode" language-code "currencyCode" currency-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-productvariants
  "Get a list of available product variations. Includes pricing information
  Get a list of all available product variations, or if one passes in a specific product type id (productId), gets a list of available variations of a recipe product."
  ([country-code product-id version source ] (get-productvariants country-code product-id version source nil))
  ([country-code product-id version source optional-params]
   (:data (get-productvariants-with-http-info country-code product-id version source optional-params))))
