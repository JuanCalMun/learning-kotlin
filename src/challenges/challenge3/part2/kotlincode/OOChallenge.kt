package challenges.challenge3.part2.kotlincode

import challenges.challenge3.part1.kotlincode.KotlinBicycle
import challenges.challenge3.part1.kotlincode.KotlinMountainBike
import challenges.challenge3.part1.kotlincode.KotlinRoadBike

fun main(args: Array<String>) {
    val regularBicycle = KotlinBicycle(1, 50)
    val mountainBike = KotlinMountainBike(12, 2, 40)
    val roadBike = KotlinRoadBike(10, 3, 90)

    regularBicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    val mountainBikeWithColor = KotlinMountainBike("red", 12, 2, 40)
    mountainBikeWithColor.printDescription()
    KotlinMountainBike.availableColors.forEach { println(it) }
}