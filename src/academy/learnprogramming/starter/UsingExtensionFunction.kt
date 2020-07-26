package academy.learnprogramming.starter

import academy.learnprogramming.functions.Car

fun main() {
    val cars = listOf(
            Car("Red", 2010),
            Car("Yellow", 2018),
            Car("Orange", 2000))

    cars.println()


    val doubleNumbers = listOf(1.9, 2.1, 3.2, 4.5)
    val longNumbers = listOf(1L, 3L, 5L, 6L)
    val shortNumbers = listOf<Short>(1, 6, 2, 8, 4)

    println("====== Convert to ints ======")
    println(converToInts(doubleNumbers))
    println(converToInts(longNumbers))
    println(converToInts(shortNumbers))

    println("====== Convert to Floats ======")
    println(doubleNumbers.convertToFloat())
    println(longNumbers.convertToFloat())
    println(shortNumbers.convertToFloat())

}