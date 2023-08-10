package designPatterns.creationalPatterns.factoryMethod.library

class Bus : Vehicle {
    override fun create() {
        println("Create a new Bus")
    }
}