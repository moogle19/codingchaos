import sys

def squareInRectangle(x,y):
    assert x>0;assert y>0
    res = list()
    while x != y:
        res.append(x if x<y else y)
        if x > y: x-=y 
        else: y-=x
    res.append(x)
    return res

eingabe = (sys.argv[1],sys.argv[2]) if len(sys.argv)>2 else (3,5)
print squareInRectangle(eingabe[0],eingabe[1])
