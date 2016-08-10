(ns learn-clojure.magic)

; merging elemtns of map
(defn merge-these
  [a & d]
  (apply (merge a d)))

(defn add-key-to-map
  [x]
  (let [m { :a 1 :b 2 }]
    (conj m x))
  )

(defn key-exists?
  [k]
  (let [m { :a 1 :b 2 }]
    (if (contains? m k)
      (println "yes")
      (println "no"))))

(defn remove-key-from-map
  [key]
  (let [m { :a 1 :b 2}]
    (dissoc m key)))


; apply function to all values in hash-map
(defn foo
  [m f]
  (into {} (for [[k v] m] [k (f v)])))

(foo {:a 1 :b 2 :c 3}, dec)


; apply function to all items in a vector
(defn bar
  [v f]
  (into [] (for [x v]
             (f x))))

(bar [1 2 3 4], dec)
