(ns .api.userinfo
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-userinfo-with-http-info
  "Get the user's language code and country based upon IP
  IP-based user info lookup"
  ([] (get-userinfo-with-http-info nil))
  ([{:keys [language-code ]}]
   (call-api "/userinfo/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"languageCode" language-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-userinfo
  "Get the user's language code and country based upon IP
  IP-based user info lookup"
  ([] (get-userinfo nil))
  ([optional-params]
   (:data (get-userinfo-with-http-info optional-params))))
