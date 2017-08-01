package com.dw.groovy.closure
/**
 * any /every /
 */

def anni = [1,2,3,4,5].any{
    element->element>4
}

println(anni)
//-~*!@#$%^&^&)**(~`/.,'][\[|":>"
def eri = [1,2,3,4,5].every {
    element->element>0
}
println eri