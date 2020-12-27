package com.hamedrahimvand.designpatterns.strategy.way_two

import java.util.*
import kotlin.random.Random

/**
 *
 *@author Hamed.Rahimvand
 *@since 12/27/20
 */
class Typist2(var typeBehavior: (String) -> String) {
    fun typeAnything(string: String) = println(typeBehavior(string))
}


val typeLowerCaseBehavior : (String) -> String = { it.toLowerCase(Locale.US) }
val typeUpperCaseBehavior : (String) -> String = { it.toUpperCase(Locale.US)}
