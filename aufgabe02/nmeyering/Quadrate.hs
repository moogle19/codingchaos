import System.Environment

chop :: Integral a => (a, a) -> [a]
chop (x, y) = chop' (x, y) []

chop' :: Integral a => (a, a) -> [a] -> [a]
chop' (x, y) rest
  | x == y = if x == 0 then rest else (x : rest)
  | x < y = chop' (y, x) rest
  | otherwise = chop' (x - y, y) (y : rest)

main = do
  [a1, a2] <- getArgs
  let [w, h] = [(read a1 :: Integer), (read a2 :: Integer)]
  print $ chop (w, h)
