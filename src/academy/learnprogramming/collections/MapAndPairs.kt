package academy.learnprogramming.collections

fun main() {

    println("============= Immutable map =============")
    var immutableMap = mapOf<Int, Car>(
            1 to Car("Blue", "Seat", 2009),
            2 to Car("Red", "Tesla", 2020),
            3 to Car("White", "Renault", 2008))
    println(immutableMap)

    println("============= Mutable map =============")
    val mutableMap = mutableMapOf<String, Car>(
            "Jhon's car" to Car("Blue", "Seat", 2009),
            "Mary's car" to Car("Red", "Tesla", 2020),
            "Amy's car" to Car("White", "Renault", 2008))
    println(mutableMap)
    mutableMap.put("Rory's car", Car("Black", "Ford", 2012))
    println(mutableMap)

    println("============= Immutable to mutable =============")
    val changedMap = immutableMap.toMutableMap()
    changedMap.put(4, Car("Black", "Ford", 2012))
    changedMap[5] = Car("Yellow", "Saab", 2015)
    println(changedMap)

    println("============= Deconstructing =============")
    for (element in mutableMap) {
        val (propietary, car) = element
        println("Is the $propietary, $car")
    }

    println("============= Lambdas =============")

    val filteredByColor = immutableMap.filter { it.value.color == "Red" }
    val filteredByModel = immutableMap.filter { it.value.model == "Tesla" }
    val filteredByYear = immutableMap.filter { it.value.year == 2020 }

    println("Filtered by Color: $filteredByColor")
    println("Filtered by Model: $filteredByModel")
    println("Filtered by Year: $filteredByYear")
}

data class Car(val color: String, val model: String, val year: Int)
