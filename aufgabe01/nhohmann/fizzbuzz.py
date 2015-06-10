import sys

def process(num):
    out = "0"
    for i in range(1, num+1):
	out += " FizzBuzz" if i%15==0 else " Fizz" if i%3==0 else " Buzz" if i%5==0 else " "+str(i)
    return out

if len(sys.argv) > 1:
    print process(int(sys.argv[1]))
else:
    print "Missing argument"