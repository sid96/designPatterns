package designPatterns.creationalPatterns.prototype.library

class Car(
    private val brand: String,
    private val tires: Int,
): Cloneable {
    override fun clone(): Car {
        return Car(
            brand,
            tires
        )
    }

    fun start() {
        println("The car is starting. Brand = $brand and Tires = $tires")
    }
}