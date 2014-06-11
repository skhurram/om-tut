;;; This namespace is used for testing purpose. It use the
;;; clojurescript.test lib.
(ns om-tut.core-test
  (:require-macros [cemerick.cljs.test :as m :refer (deftest testing are)])
  (:require [cemerick.cljs.test :as t]
            ))
;;[om-tut.core :refer (foo)]

(deftest foo-test
  (testing "I don't do a lot\n"
    (testing "Edge cases\n"
      (testing "(foo str)"
        (are [expected actual] (= expected actual)
             "ClojureScript!"
             "Hello, ClojureScript!" )
        #_(are [expected actual] (= expected actual)
             "ClojureScript!" (foo "")
             "Hello, ClojureScript!" (foo nil))))))
