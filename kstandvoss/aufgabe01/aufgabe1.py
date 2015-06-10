
stop = input("Enter number: ")

for x in xrange(1,stop+1):
	if x%3==0:
		if x%5==0:
			print "FizzBuzz"
		else:
			print "Fizz"
	elif x%5 ==0: 
		print "Buzz"
	else: 
		print x

