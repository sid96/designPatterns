package designPatterns.creationalPatterns.prototype

import designPatterns.creationalPatterns.prototype.library.Car

fun main() {

    val myCar = Car(
        brand = "Mercedes",
        tires = 4
    )

    val myCarClone = myCar.clone()

    println("My car = $myCar")
    println("My car clone = $myCarClone")

    myCarClone.start()
}