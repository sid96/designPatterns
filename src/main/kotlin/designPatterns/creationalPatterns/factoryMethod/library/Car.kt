package designPatterns.creationalPatterns.factoryMethod.library

class Car : Vehicle {
    override fun create() {
        println("Create a new Car")
    }
}