package challenges.challenge3.part1.kotlincode

class KotlinMountainBike(
        var seatHeight: Int,
        cadence: Int,
        speed: Int,
        gear: Int = 10) : KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10)
            : this(seatHeight, cadence, speed, gear) {
        println("The color of the bike is $color")
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "white", "brown")
    }
    
    override fun printDescription() {
        super.printDescription()
        println("The mountan bike has a seat height of $seatHeight inches.")
    }
}

