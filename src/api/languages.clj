(ns .api.languages
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-language-text-with-http-info
  "Get text in a specified language
  Get text in a specified language"
  ([language-code ] (get-language-text-with-http-info language-code nil))
  ([language-code {:keys [key ]}]
   (call-api "/languages/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"languageCode" language-code "key" key }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-language-text
  "Get text in a specified language
  Get text in a specified language"
  ([language-code ] (get-language-text language-code nil))
  ([language-code optional-params]
   (:data (get-language-text-with-http-info language-code optional-params))))
