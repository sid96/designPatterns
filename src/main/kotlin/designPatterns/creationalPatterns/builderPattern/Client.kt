package designPatterns.creationalPatterns.builderPattern

import designPatterns.creationalPatterns.builderPattern.library.Car


fun main() {

    val car = Car.Builder()
        .engine("Engine")
        .wheels("Wheels")
        .mirrors("Mirrors")
        .build()

    Car.Builder()

    println(
        "engine - ${car.engine}\nwheels - ${car.wheels}\nmirrors - ${car.mirrors}"
    )

}