#!/usr/bin/python

import sys

length = int(sys.argv[1])
height = int(sys.argv[2])

# print squareInRectangle(length, height)

# def squareInRectangle(length, height):
blurp = length * height

ret = []
i = blurp # eig sqrt schneller! vermutlich...
while i > 0:
	if i*i <= blurp:
		ret.append(i)
		blurp -= i*i
	if i*i > blurp:
		i -= 1

print ret