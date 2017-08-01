package com.dw.groovy.closure
/**
 * Closure with method parameter
 */

def filter(list, predicate) {
    return list.findAll(predicate)
}

def isEven = { x -> return (x % 2 == 0) }
def isOdd = { x -> return !isEven(x) }

def tabel = [1,2,3,4,5,6,7]

def event = filter(tabel,isEven)
println(event)