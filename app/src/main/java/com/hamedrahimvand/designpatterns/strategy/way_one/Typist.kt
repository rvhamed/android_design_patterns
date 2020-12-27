package com.hamedrahimvand.designpatterns.strategy.way_one

/**
 *
 *@author Hamed.Rahimvand
 *@since 12/27/20
 */
class Typist (var typeBehavior: TypeBehavior) {

    fun type(anything:String){
        typeBehavior.typeAnything(anything)
    }
}