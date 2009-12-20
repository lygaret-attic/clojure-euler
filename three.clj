(comment "
  The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?")

(ns com.typoet.euler.three
  (:gen-class)
  (:require [clojure.contrib.math :as math]))

; factor by direct search
(defn largest-prime-factor [num cur]
  (if (= num cur)
    num
    (if (zero? (rem num cur))
      (largest-prime-factor (/ num cur) cur)
      (largest-prime-factor num (inc cur)))))

; (factor 20 2) =>
; num != cur
; (20 / 2 = 10 rem 0) so, we divide and recurse
; (factor 10 2) =>
; num != cur
; (10 / 2 = 5 rem 0) so, we divide and recurse
; (factor 5 2) =>
; num != cur
; (5 / 2 = 2 rem 1) so, we inc cur
; (factor 5 3) =>
; num != cur
; (5 / 3 = 1 rem 2) so, we inc cur
; (factor 5 4) =>
; num != cur
; (5 / 4 = 1 rem 1) so, we inc cur
; (factor 5 5) =>
; num == cur, so 5 is the largest prime factor

(defn -main []
  (println
    (largest-prime-factor 600851475143 2)))