(ns learn-clojure.map)

; say 'hello' to names in vector
(defn say-hello
  [x]
  (map #(str "Hello " % "!") x))

(println (say-hello ["Lisimba" "Joe" "Mary"]))


(defn get-fnames
  [x]
  (get x :fname)
  )

(defn print-list
  [numbers]
  (mapv get-fnames numbers))

(print-list [{ :fname "Lisimba" :lname "Gilkes" :nationality "British" } { :fname "Joe" :lname "Bloggs" :nationality "Canadian" }])