import sys

def fizzBuzz(number):
    for i in range(number):
        r= ('Fizz' if i%3==0 else '')+('Buzz' if i%5==0 else '')
        yield r if r!='' else str(i)

f=fizzBuzz(sys.argv[1] if len(sys.argv)>1 else 100)
for i in f:
    print i