import sys

def squares(length, height):

    smaller = height
    bigger = length

    if length < height:
        smaller = length
        bigger = height

    while smaller > 0:
        print(smaller)
        temp = smaller
        smaller = bigger - smaller
        bigger = temp


if __name__ == '__main__':
    if len(sys.argv) < 3:
        raise Exception("missing arguments")
    squares(int(sys.argv[1]), int(sys.argv[2]))
