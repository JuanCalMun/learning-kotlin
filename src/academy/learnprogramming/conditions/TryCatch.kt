package academy.learnprogramming.conditions

fun main(args: Array<String>) {
    println(getNumberFromString("241"))
    println(getNumberFromString("241.2"))
    println(getNumberFromString("241,2"))
    println(getNumberFromString("A"))
    println(getNumberFromString("HOLA"))
    println(parseNullSafe("241"))
    println(parseNullSafe("241.2"))
    println(parseNullSafe("241,2"))
    println(parseNullSafe("A"))
    println(parseNullSafe("HOLA"))
}

fun getNumberFromString(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (exception: NumberFormatException) {
        0
    } finally {
        println("The value of the variable to parse is $str")
        1 //This value is not returned, is ignored
    }
}

fun getNumberFromStringNullReturn(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (exception: NumberFormatException) {
        null
    } finally {
        println("The value of the variable to parse is $str")
        1 //This value is not returned, is ignored
    }
}

fun parseNullSafe(str: String): Any =
        getNumberFromStringNullReturn(str) ?: "I can't pase to Integer the value $str"


