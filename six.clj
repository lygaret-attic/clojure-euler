(ns com.typoet.euler.six
  (:gen-class))

(defn square [num] (* num num))

(defn square-sum [xs]
  (square (reduce + xs)))

(defn sum-squares [xs]
  (reduce + (map square xs)))

(defn -main []
  (println
    (let [xs (range 1 101)]
      (- (square-sum xs) (sum-squares xs)))))