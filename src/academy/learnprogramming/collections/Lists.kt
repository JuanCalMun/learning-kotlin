package academy.learnprogramming.collections

fun main() {
    println("========== working with mutability ==========")
    val seasons = listOf("Spring", "Summer", "Winter", "Fall")
    println(seasons)
//    seasons.add It can't be added because Kotlin makes immutable

    val mutableSeasons = mutableListOf("Spring", "Summer", "Winter")
    println(mutableSeasons)
    mutableSeasons.add("Fall")
    println(mutableSeasons)
    mutableSeasons[3] = "Autumn"
    println(mutableSeasons)

    println("========== working with nulls ==========")
    val saluteList = listOfNotNull("Hello", null, "Hi!!!")
    println(saluteList)
    println(saluteList)

    println("========== working with list of nulls ==========")
    val randomList: List<Any?> = listOf("Random", 1, null, 3L, 4.5, "String")
    println(randomList)
    println(randomList.map { it?.javaClass ?: "null" })
    println(randomList.filterNotNull())
    println(randomList.filterNotNull().map(Any::javaClass))

    println("========== working with arrays and lists ==========")
    val arrayOfSeasons = arrayOf("Spring", "Summer", "Winter", "Fall")
    val listOfSeasos = listOf(*arrayOfSeasons)
    println(arrayOfSeasons)
    println(listOfSeasos)
    println(arrayOfSeasons.javaClass)
    println(listOfSeasos.javaClass)
}