# -*- coding: utf8 -*-
import sys

def FizzBuzz(limit):
	for number in range(1, limit+1):
		retNum = ''
		if number % 3 == 0:
			retNum += 'Fizz'
		if number % 5 == 0:
			retNum += 'Buzz'
		yield str(number) if retNum == '' else retNum

if __name__ == '__main__':
	for number in FizzBuzz(int(sys.argv[1])):
		print(number)