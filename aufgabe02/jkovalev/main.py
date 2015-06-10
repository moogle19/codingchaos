import sys

def main(length, height):
	l, h = length, height
	if l == 1 and h == 1:
		return [1]
	if l >= h:
		l, h = l-h, h
		return [h] + main(l, h)
	else:
		l, h = l, h-l
		return [l] + main(l, h)


if __name__ == "__main__":
	if len(sys.argv) < 2:
		raise Exception("argument missing")
	rects = main(int(sys.argv[1]), int(sys.argv[2]))
	print(rects)