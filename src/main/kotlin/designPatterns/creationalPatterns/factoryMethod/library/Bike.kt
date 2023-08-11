package designPatterns.creationalPatterns.factoryMethod.library

class Bike: Vehicle {
    override fun create() {
        println("Create a new Bike")
    }
}