package academy.learnprogramming.conditions

fun main() {
    for (num in 1..5) {
        println("--- Number $num ---")
        severalOptions(num)
        evenOrOdd(num)
        checkRange(num)
        anotherCheckRange(num)
    }
}

fun severalOptions(num: Int) = when (num) {
    1 -> println("One")
    2 -> println("Two")
    3 -> println("Three")
    4 -> println("Four")
    else -> println("Not defined")
}

fun evenOrOdd(num: Int) = when (num) {
    1, 3 -> println("Odd")
    2, 4 -> println("Even")
    else -> println("Not defined")
}

fun checkRange(num: Int) = when (num) {
    in 1..3 -> println("First three numbers")
    4 -> println("It is the number four")
    else -> println("Not defined")
}

fun anotherCheckRange(num: Int) = when {
    num < 4 -> println("Fewer than four")
    num > 4 -> println("Greater than four")
    else -> println("Not more, not less. Just four")
}