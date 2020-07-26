package academy.learnprogramming.starter

fun main() {
    val names = mutableListOf("Hello", "Bye", "Hi")
    names.map { println(it) }

    names.println()

}

/**
 * Now println can be used by any list of the application.
 * See UsingExtensionFunction.kt
 */
fun <E> List<E>.println() = this.map { println(it) }

fun <T : Number> converToInts(listOfNumbers: List<T>) = listOfNumbers.map { it.toInt() }

fun <T : Number> List<T>.convertToFloat() = this.map { it.toFloat() }