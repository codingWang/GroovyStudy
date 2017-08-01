package com.dw.groovy.closure

/**
 * Closure with map
 */
["a":21,"b":30,"c":35].each {
    num->if(num.value >=25) println(num.key)
}
