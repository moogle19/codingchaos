import sys
for n in range(1,int(sys.argv[1])+1):
  o=''
  if n%3==0: o='Fizz'
  if n%5==0: o+='Buzz'
  print o and o or n
