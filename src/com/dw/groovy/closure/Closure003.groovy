package com.dw.groovy.closure

/***
 * hide parameter
 */
def clos = { println("hellow ${it}") }

clos.call('s')
