package academy.learnprogramming.conditions

fun main(args: Array<String>) {
    val integerRange = 0..12
    val charRange = 'a'..'j'

    for (integer in integerRange)
        println("integer: $integer")

    for (char in charRange)
        println("char: $char")

    for (evenInt in integerRange step 2)
        println("even: $evenInt")

    for (reverseInteger in integerRange.reversed())
        println("reverse: $reverseInteger")

    for (num in 1..12)
        println("inline declaration: $num")

    for (num in (1..12).reversed())
        println("reversed inline declaration: $num")

    for (i in 1 until 10)
        println("i with until: $i")

    for (i in 12 downTo 0)
        println("i down to: $i")

    val text = "Hello!"
    for (char in text)
        println("char: $char")

    for (index in text.indices)
        println("char[$index] : ${text[index]}")


    val seasons = arrayOf("Spring", "Summer", "Winter", "Fall")
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("index $index value $value") }

    for (char in 'A'..'R') {
        integerLoop@ for (integer in 1..10) {
            for (internalInteger in 900..930) {
                println("$char$integer: $internalInteger")
                if (char == 'A' && internalInteger == 905) {
                    println("CONTINUE integer loop")
                    continue@integerLoop
                }
                if (internalInteger == 910) {
                    println("BREAK integer loop")
                    break@integerLoop
                }
            }
        }
    }

    /*
    Unable to iterate Strings
    val stringRange = "AAA".."ZZZ"
    for (string in stringRange)
        println("string: $string")
    */
}