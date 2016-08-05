(ns learn-clojure.namespaces)

(require '[clj-postgresql.core :as pg]
         '[clojure.java.jdbc :as jdbc])

(def db (pg/pool :host "localhost"
                  :dbname "postgres"
                  :user "postgres"
                  :password "p"))

(defn execute_query
  [query]
  (jdbc/query db [query])
  )


