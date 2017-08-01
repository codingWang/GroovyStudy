package com.dw.groovy.closure
/***
 * Closure with list
 */
[1, 2, 3, 4,].each {
    num -> if (num % 2 == 0) println(num)
}