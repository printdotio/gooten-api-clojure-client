(ns .api.productpreview
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-productpreview-with-http-info
  "Submit an image (or images) to be rendered into a product preview.
  Submit an image (or images) to be rendered into a product preview."
  [product-preview-request ]
  (call-api "/productpreview/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    product-preview-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-productpreview
  "Submit an image (or images) to be rendered into a product preview.
  Submit an image (or images) to be rendered into a product preview."
  [product-preview-request ]
  (:data (p-ost-productpreview-with-http-info product-preview-request)))
