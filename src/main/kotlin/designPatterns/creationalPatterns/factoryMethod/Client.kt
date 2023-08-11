package designPatterns.creationalPatterns.factoryMethod

import designPatterns.creationalPatterns.factoryMethod.library.VehicleFactory
import designPatterns.creationalPatterns.factoryMethod.library.VehicleType

fun main() {

    val car = VehicleFactory.getVehicle(VehicleType.Car)
    car.create()

    val bus = VehicleFactory.getVehicle(VehicleType.Bus)
    bus.create()

    val bike = VehicleFactory.getVehicle(VehicleType.Bike)
    bike.create()
}