import com.hamedrahimvand.designpatterns.strategy.way_one.*
import com.hamedrahimvand.designpatterns.strategy.way_two.*

/**
 *
 *@author Hamed.Rahimvand
 *@since 12/27/20
 */
fun main() {
    //region first way
    println("---------WAY1---------")
    val typist = Typist(TypeUpperCaseBehavior())
    typist.type("The advice is a human sun!")
    typist.typeBehavior = TypeLowerCaseBehavior()
    typist.type("Die accelerative like a crazy star.")
    //endregion

    println("---------WAY2---------")

    //region second way
    val typist2 = Typist2(typeUpperCaseBehavior)
    typist2.typeAnything("An united form of vision is the fear.")
    typist2.typeBehavior = typeLowerCaseBehavior
    typist2.typeAnything("Boundless satoris views most beauties!")

    //endregion
}
