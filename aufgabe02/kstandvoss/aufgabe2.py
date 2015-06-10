import sys

l = int(sys.argv[1])
h = int(sys.argv[2])

b = l if l > h else h
r = []
s = l*h
for x in range(b,0,-1):
	while x*x <= s:
		r.append(x) 
		s -= x*x

print r	