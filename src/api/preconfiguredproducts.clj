(ns .api.preconfiguredproducts
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-preconfiguredproducts-with-http-info
  "Insert a preconfigured product
  Insert a preconfigured product into your recipe."
  [preconfigured-product-insert version source ]
  (call-api "/preconfiguredproducts/v/{version}/source/{source}/" :post
            {:path-params   {"version" version "source" source }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    preconfigured-product-insert
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-preconfiguredproducts
  "Insert a preconfigured product
  Insert a preconfigured product into your recipe."
  [preconfigured-product-insert version source ]
  (:data (create-preconfiguredproducts-with-http-info preconfigured-product-insert version source)))

(defn delete-preconfiguredproducts-with-http-info
  "Delete a preconfigured product
  Delete a preconfigured product from your recipe."
  ([version source ] (delete-preconfiguredproducts-with-http-info version source nil))
  ([version source {:keys [sku ]}]
   (call-api "/preconfiguredproducts/v/{version}/source/{source}/" :delete
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"sku" sku }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn delete-preconfiguredproducts
  "Delete a preconfigured product
  Delete a preconfigured product from your recipe."
  ([version source ] (delete-preconfiguredproducts version source nil))
  ([version source optional-params]
   (:data (delete-preconfiguredproducts-with-http-info version source optional-params))))

(defn get-preconfiguredproducts-with-http-info
  "Get a list of your preconfigured products
  Get a list of your preconfigured products. The products returned are entirely specific to your recipe."
  ([country-code version source ] (get-preconfiguredproducts-with-http-info country-code version source nil))
  ([country-code version source {:keys [language-code currency-code ]}]
   (call-api "/preconfiguredproducts/v/{version}/source/{source}/" :get
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"countryCode" country-code "languageCode" language-code "currencyCode" currency-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-preconfiguredproducts
  "Get a list of your preconfigured products
  Get a list of your preconfigured products. The products returned are entirely specific to your recipe."
  ([country-code version source ] (get-preconfiguredproducts country-code version source nil))
  ([country-code version source optional-params]
   (:data (get-preconfiguredproducts-with-http-info country-code version source optional-params))))

(defn update-preconfiguredproducts-with-http-info
  "Update a preconfigured product
  Update a preconfigured product into your recipe."
  [preconfigured-product-insert version source ]
  (call-api "/preconfiguredproducts/v/{version}/source/{source}/" :put
            {:path-params   {"version" version "source" source }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    preconfigured-product-insert
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-preconfiguredproducts
  "Update a preconfigured product
  Update a preconfigured product into your recipe."
  [preconfigured-product-insert version source ]
  (:data (update-preconfiguredproducts-with-http-info preconfigured-product-insert version source)))
