(ns .api.orders
  (:require [.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn g-et-orders-with-http-info
  "Get an order
  Gets basic information about an order."
  ([id version source ] (g-et-orders-with-http-info id version source nil))
  ([id version source {:keys [language-code ]}]
   (call-api "/orders/v/{version}/source/{source}/" :get
             {:path-params   {"version" version "source" source }
              :header-params {}
              :query-params  {"id" id "languageCode" language-code }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn g-et-orders
  "Get an order
  Gets basic information about an order."
  ([id version source ] (g-et-orders id version source nil))
  ([id version source optional-params]
   (:data (g-et-orders-with-http-info id version source optional-params))))

(defn p-ost-orders-with-http-info
  "Submit an order
  Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag."
  [order version source ]
  (call-api "/orders/v/{version}/source/{source}/" :post
            {:path-params   {"version" version "source" source }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn p-ost-orders
  "Submit an order
  Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag."
  [order version source ]
  (:data (p-ost-orders-with-http-info order version source)))
