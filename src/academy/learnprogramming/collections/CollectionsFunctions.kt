package academy.learnprogramming.collections

fun main() {
    val seasons = listOf("Spring", "Summer", "Winter", "Fall")
    val goodColors = listOf("Blue", "Black")
    val badColors = listOf("White", "Yellow", "Orange", "Black", "Yellow", "Orange")

    println(seasons.last())
    println(seasons.asReversed())

    println(seasons.getOrNull(2))
    println(goodColors.getOrNull(2))

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.max())
    println(numbers.sum())

    val pairSeasonsColors = seasons.zip(goodColors)
    println("zipped(in pairs): $pairSeasonsColors")
    println(pairSeasonsColors.javaClass)

    val mergedColors = listOf(goodColors, badColors)
    println("merged: $mergedColors")

    val combinedColors = goodColors + badColors
    println("combined $combinedColors")

    val noDuplicatedColors = goodColors.union(badColors)
    println("no duplicated: $noDuplicatedColors")

    val onlyDuplicatedColors = goodColors.intersect(badColors)
    println("only duplicated: $onlyDuplicatedColors")

    val noDuplicatedsInSameList = badColors.distinct()
    println("no duplicated in same list: $noDuplicatedsInSameList")

    val mutableSeasons = seasons.toMutableList()
    mutableSeasons[0] = "Changed"
    mutableSeasons.add("Now i can change it")
    println("mutableSeasons: $mutableSeasons")
}