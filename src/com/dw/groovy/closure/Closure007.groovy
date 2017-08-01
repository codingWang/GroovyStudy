package com.dw.groovy.closure


def value = [1, 2, 3, 4, 5, 6].findAll {
    vl -> vl > 3
}

value.each { println(it) }//4,5,6
