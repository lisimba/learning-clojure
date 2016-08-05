(ns learn-clojure.lets)

(defn country
  []
  'England)

(defn capital
  []
  'London)

(defn country_and_capital
  []
  (let [a (country)
        b (capital)]
    (println (str "The capital of " a " is "  "."))))

(defn is-odd-number?
  [num]
  (if-let [result (odd? num)]
    (str num " is an odd number")
    (str num " is not an odd number")))

(defn print-if-even!
  [num]
  (when-let [result (even? num)]
    (str "printed an even number:" num)))

; http://blog.jayfields.com/2011/03/clojure-if-let-and-when-let.html