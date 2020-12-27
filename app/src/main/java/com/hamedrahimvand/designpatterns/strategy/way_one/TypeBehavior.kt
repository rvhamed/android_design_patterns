package com.hamedrahimvand.designpatterns.strategy.way_one

import kotlin.random.Random

/**
 *
 *@author Hamed.Rahimvand
 *@since 12/27/20
 */
interface TypeBehavior{
    fun typeAnything(text:String)
}

class TypeLowerCaseBehavior : TypeBehavior {
    override fun typeAnything(text: String) {
        println(text.toLowerCase())
    }
}

class TypeUpperCaseBehavior : TypeBehavior {
    override fun typeAnything(text: String) {
        println(text.toUpperCase())
    }
}

