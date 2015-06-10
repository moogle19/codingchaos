def fizzBuzz(number):
    for i in range(number):
        r= 'Fizz' if i%3==0 else ''+'Buzz' if i%5==0 else ''
        yield r if r!='' else str(i)
    return

f=fizzBuzz(100)
for i in f:
    print i