(ns learn-clojure.data-structures)

(defn hashmap1 ; first way of defining hash map
  []
  (hash-map :first_name 'Lisimba, :last_name 'Gilkes) )

(defn hashmap2 ; short-hand way of defining hash map
  []
  { :first_name 'Lisimba, :last_name 'Gilkes})

(defn vector1 ; first way of defining a vector
  []
  (vector {:a 1, :b 2} 3 4))

(defn vector2 ; short-hand way of defining vector
  []
  [{:a 1, :b 2} 3 4 5 6 'Lisimba 'Gilkes])


(defn value-of-first-item-in-vector
  [v k]
  (get (first v) k)
  )

; (value-of-first-item-in-vector  [{:a 1, :b 2} 3 4 5 6 'Lisimba 'Gilkes] :a)