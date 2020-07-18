package challenges.challenge3.part1.kotlincode

class KotlinRoadBike(
        val tireWidth: Int,
        cadence: Int,
        speed: Int,
        gear: Int) : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth milimeters.")
    }
}