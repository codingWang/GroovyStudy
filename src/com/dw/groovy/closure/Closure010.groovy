package com.dw.groovy.closure
/**
 * 闭包作为另外一个闭包的参数
 */
def takeWhile = { predicate, list ->
    def result = []
    for (element in list) {
        if (predicate(element))
            result << element
        else
            return result
    }
    return result
}

def isEven = { x -> return (x % 2 == 0) }
def isOdd = { x -> return !isEven(x) }

def table1 = [12,14,15,18]
def table2 = [11,13,15,16,18]

def event = takeWhile.call(isEven,table1)
println(event)
