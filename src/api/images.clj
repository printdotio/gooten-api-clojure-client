(ns .api.images
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn post-images-with-http-info
  "POSTs files to a temporary store
  POSTs files to a temporary store"
  [^File images ]
  (call-api "/images/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"Images" images }
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn post-images
  "POSTs files to a temporary store
  POSTs files to a temporary store"
  [^File images ]
  (:data (post-images-with-http-info images)))
