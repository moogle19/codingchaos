# -*- coding: utf8 -*-
import sys

def SquareInRectangle(width, height):
	squares = []
	while width >= 1 and height >= 1:
		if width > height:
			squares.append(height)
			width -= height
		elif height > width:
			squares.append(width)
			height -= width
		else:
			squares.append(height)
			return squares

if __name__ == '__main__':
	print(SquareInRectangle(int(sys.argv[1]), int(sys.argv[2])))