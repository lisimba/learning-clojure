(ns learn-clojure.conditionals)

(defn large-number? [num]
  (if (> num 100)
    "yes"
    "no"))

(defn large-number-with-message? [num]
  (if (> num 100)
    (do
      (println num)
      (println "is a large number"))
    (println "not a large number")
    ))

(defn print-count-times [count]
  (loop [x count]
    (when (> x 0)
      (println x)
      (recur (- x 1)))))

(defn for-loop [x]
  (for [x x]
    (println x)))