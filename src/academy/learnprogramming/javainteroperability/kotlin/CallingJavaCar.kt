package academy.learnprogramming.javainteroperability.kotlin

import academy.learnprogramming.javainteroperability.java.Car

fun main() {
    val car = Car("Blue", "Tesla", 2020)
    car.color = "Green"
    println(car)

//    car.color = null //java.lang.IllegalArgumentException: Argument for @NotNull parameter 'color'

//    car.model = null
    println(car)

    var carModel = car.model
//    carModel = null
    println(carModel)
}