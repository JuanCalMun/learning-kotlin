package challenges.challenge3.part1.kotlincode

class KotlinMountainBike(
        var seatHeight: Int,
        cadence: Int,
        speed: Int,
        gear: Int) : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The mountan bike has a seat height of $seatHeight inches.")
    }
}

