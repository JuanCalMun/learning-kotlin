package academy.learnprogramming.conditions

fun main(args: Array<String>) {
    val something = true
    val anything = false
    println("something ${checkBoolean(something)}")
    println("anything ${checkBoolean(anything)}")

    val variableExpresion = if (something) 5 else 25
    println("variableExpresion $variableExpresion")

    val emptyVariable = if (anything) println("I'm in") else println("I'm out")
    emptyVariable
    println(emptyVariable.javaClass)
}

fun checkBoolean(checker: Boolean) = if (checker) "Is true" else "Is False"