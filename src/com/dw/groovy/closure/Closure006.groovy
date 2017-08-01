package com.dw.groovy.closure

def value = [1, 2, 3, 4, 5, 6].find { vl -> vl > 3 }
println(value)//4
