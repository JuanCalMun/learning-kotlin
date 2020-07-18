package challenges.challenge3.part1.kotlincode

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() =
            println("Bike is in gear $gear with a cadence $cadence traveling at a speed of $speed.")

}
