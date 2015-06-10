import sys
def s(l,h):
  if l<h:l,h=h,l
  return h>0 and[h]+s(l-h,h)or[]
print sorted(s(*map(int,sys.argv[1:])),reverse=True)

