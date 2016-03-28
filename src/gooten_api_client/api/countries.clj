(ns gooten-api-client.api.countries
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn countries-with-http-info
  "Get a list of supported countries. Output is in specified language.
  Get a list of supported countries. Output is in specified language."
  ([] (countries-with-http-info nil))
  ([{:keys [language-code key ]}]
   (call-api "/countries/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"languageCode" language-code "key" key }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn countries
  "Get a list of supported countries. Output is in specified language.
  Get a list of supported countries. Output is in specified language."
  ([] (countries nil))
  ([optional-params]
   (:data (countries-with-http-info optional-params))))
