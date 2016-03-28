(ns gooten-api-client.api.ordersearch
  (:require [gooten-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn g-et-ordersearch-with-http-info
  "Search an orders
  Search through the orders and return information about orders that match search criteria."
  ([partner-billing-key ] (g-et-ordersearch-with-http-info partner-billing-key nil))
  ([partner-billing-key {:keys [generic-values last-name email postal-code start-date end-date unique-user-id partner-id page-size page ]}]
   (call-api "/ordersearch/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"partnerBillingKey" partner-billing-key "genericValues" generic-values "lastName" last-name "email" email "postalCode" postal-code "startDate" start-date "endDate" end-date "uniqueUserId" unique-user-id "partnerId" partner-id "pageSize" page-size "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn g-et-ordersearch
  "Search an orders
  Search through the orders and return information about orders that match search criteria."
  ([partner-billing-key ] (g-et-ordersearch partner-billing-key nil))
  ([partner-billing-key optional-params]
   (:data (g-et-ordersearch-with-http-info partner-billing-key optional-params))))
