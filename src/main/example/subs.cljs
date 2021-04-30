(ns example.subs
  (:require [re-frame.core :refer [reg-sub dispatch subscribe]]))

(reg-sub
 :get-counter
 (fn [db _]
   (:counter db)))

(reg-sub
 :counter-tappable?
 (fn [db _]
   (:counter-tappable? db)))

(->> @re-frame.db/app-db)