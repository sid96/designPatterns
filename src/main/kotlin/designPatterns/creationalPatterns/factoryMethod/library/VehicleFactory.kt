package designPatterns.creationalPatterns.factoryMethod.library

class VehicleFactory {

    companion object {
        fun getVehicle(vehicleType: VehicleType): Vehicle {
            return when (vehicleType) {
                VehicleType.Car -> Car()
                VehicleType.Bus -> Bus()
                VehicleType.Bike -> Bike()
            }
        }
    }
}