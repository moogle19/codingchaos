# -*- coding: utf-8 -*-
"""
Created on Wed Jun 10 18:31:09 2015

@author: joclement
"""
var = raw_input("")
for i in range(int(var)):
    j = ""
    if i % 3 == 0:
        j+="Fizz"
    if i % 5 == 0:
        j+="Buzz"
    if j == "":
        j=i
    print j
