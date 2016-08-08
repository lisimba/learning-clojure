(ns learn-clojure.error-handling)

(defn crash []
  (try
    (/ 1 0)
    (catch Exception e (println (.getMessage e)))))


(defn crash-on-even-numbers! [n]
  (if (even? n)
    (throw (Exception. "I don't like even numbers!"))
    (println n)))