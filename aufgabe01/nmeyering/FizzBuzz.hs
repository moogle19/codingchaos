-- ausführen als `runhaskell FizzBuzz.hs` pls, kthxbai
data FizzBuzz = FizzBuzz Integer

instance Show FizzBuzz where
  show (FizzBuzz n)
    | mod n 3 == 0 && mod n 5 == 0 = "FizzBuzz"
    | mod n 3 == 0 = "Fizz"
    | mod n 5 == 0 = "Buzz"
    | otherwise = show n

main = do
  line <- getLine
  print $ FizzBuzz (read line :: Integer)
