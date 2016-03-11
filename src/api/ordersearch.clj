(ns .api.ordersearch
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn g-et-ordersearch-with-http-info
  "Search an orders
  Search through the orders and return information about orders that match search criteria."
  ([] (g-et-ordersearch-with-http-info nil))
  ([{:keys [generic-values last-name email postal-code start-date end-date unique-user-id partner-id page-size page ]}]
   (call-api "/ordersearch/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"genericValues" generic-values "lastName" last-name "email" email "postalCode" postal-code "startDate" start-date "endDate" end-date "uniqueUserId" unique-user-id "partnerId" partner-id "pageSize" page-size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn g-et-ordersearch
  "Search an orders
  Search through the orders and return information about orders that match search criteria."
  ([] (g-et-ordersearch nil))
  ([optional-params]
   (:data (g-et-ordersearch-with-http-info optional-params))))
