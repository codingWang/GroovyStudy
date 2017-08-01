package com.dw.groovy.closure

/***
 * Closure with parameters
 */
def clos = { param -> println("hellow ${param}") }

clos.call("world")

clos.call('aaa')

clos('s')