(ns .api.orderstatus
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn p-ost-orderstatus-with-http-info
  "Update an order status
  Update status of each order item."
  [id order-status-name ]
  (call-api "/orderstatus/" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"id" id "orderStatusName" order-status-name }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-orderstatus
  "Update an order status
  Update status of each order item."
  [id order-status-name ]
  (:data (p-ost-orderstatus-with-http-info id order-status-name)))
