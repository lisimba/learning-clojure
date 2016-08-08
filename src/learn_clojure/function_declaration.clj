(ns learn-clojure.function-declaration)


; private function
(defn- concatenate
  [firstname lastname]
  (str firstname  " " lastname))

(defn fullname
  [firstname lastname]
  (concatenate firstname lastname)
  )

; function without arguments
(defn no-arguments []
  (println "I'm a function without arguments")
  )

; multi arity functions - can be used to set default values for example.
(defn greet
  ([] (greet "Joe Bloggs"))
  ([name] (println "Hello" name)))

; multi arity function with loop
(defn printer
  ([] (printer 10))
  ([count]
             (loop [x count]
               (when (> x 0)
                 (println x)
                 (recur (- x 1))))
             ))

; variadic function
(defn variadic
  [firstname & rest]
  (println firstname)
  (for [x rest]
    (println x)))

