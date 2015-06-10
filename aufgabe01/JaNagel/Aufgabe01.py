def fizzBuzz(number):
    for i in range(number):
        yield (str(i) if i%3!=0 and i%5!=0 else ('Fizz' if i%5!=0 else ('Buzz' if i % 3 != 0 else 'FizzBuzz')))
    return

f=fizzBuzz(100)
for i in f:
    print i