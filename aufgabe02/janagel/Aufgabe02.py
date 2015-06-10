import sys

def squareInRectangle(size):
    assert size[0] > 0;assert size[1] > 0
    result = list()
    while size[0] != size[1]:
        if size[0] > size[1]: size = (size[1],size[0]) #Sort
        result.append(size[0])
        size = (size[1]-size[0],size[0])
    result.append(size[0])
    return result

print squareInRectangle((sys.argv[1],sys.argv[2]) if len(sys.argv)>2 else (300,5))