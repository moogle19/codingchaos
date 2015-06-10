import sys

def process(length, height):
    if length == 0 or height == 0:
	return []

    if length < height:
	return process(height, length)

    return [height] + process(height, length-height)


if len(sys.argv) > 2:
    print process(int(sys.argv[1]), int(sys.argv[2]))
else:
    print "Missing arguments"
    sys.exit(1)