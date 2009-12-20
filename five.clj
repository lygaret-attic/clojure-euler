(comment "
  2520 is the smallest number that can be divided by each of the numbers
  from 1 to 10 without any remainder.

  What is the smallest number that is evenly divisible by all of the numbers
  from 1 to 20?")

(ns com.typoet.euler.five
  (:gen-class)
  (:require [clojure.contrib.math :as math]))
             
(defn -main []
  (println
    (reduce #(math/lcm %1 %2) (range 1 21))))
