(ns om-tut.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state (atom {:text "Hello Wolrd!"}))

(om/root
 (fn [app owner]
   (dom/h1 nil (:text app)))
 app-state
 {:target (. js/document (getElementById "app"))})



(swap! app-state assoc :text "power")
