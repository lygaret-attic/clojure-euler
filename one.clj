(comment
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we
  get 3, 5, 6, and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.)

(ns com.typoet.euler.one
  (:gen-class))

(defn- any? [item preds]
  (some #(% item) preds))

(defn- filterany [xs preds]
  (filter #(any? % preds) xs))

(defn- ismult? [mult] (fn [num] (= 0 (rem num mult))))

(defn -main []
  (println
    (reduce + (filterany (range 1 1000) [(ismult? 5), (ismult? 3)]))))