import sys
for n in range(1,int(sys.argv[1])+1):
 print'%s%s'%(n%3==0 and'Fizz'or'',n%5==0 and'Buzz'or'')or n
