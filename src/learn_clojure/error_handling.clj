(ns learn-clojure.error-handling
  (:require [clojure.test :refer :all]
            [taoensso.timbre :as timbre]))
(defn handle-exception []
  (try
    (/ 1 0)
    (catch Exception e (println (.getMessage e)))))


(defn handle-exception-on-even-numbers! [n]
  (if (even? n)
    (throw (Exception. "I don't like even numbers!"))
    (println n)))

(defn print-info
  []
  (info "Print at info level"))

(deftest testing1
         []
         (println "output" (is (= 0 1))))