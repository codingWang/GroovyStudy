package com.dw.groovy.closure

def multiply(x) {
    return { y -> x * y }//返回一个闭包
}

def twice = multiply(2)
print("${twice 4}")