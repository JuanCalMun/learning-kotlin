package academy.learnprogramming.functions

fun main(args: Array<String>) {
    val times = 90
    var startTime: Long

    startTime = System.nanoTime()
    if (times < 45)
        for (i in 0..times) println("regular: " + fibonacci(i))
    val regularFibonacciTime = (System.nanoTime() - startTime).div(1000000)


    startTime = System.nanoTime()
    improvedFibonacci(times)
    val improvedFibonacciTime = (System.nanoTime() - startTime).div(1000000)

    println("Regular time: ${if (regularFibonacciTime == 0L) "off" else ("$regularFibonacciTime ms")} " +
            "${System.lineSeparator()}" +
            "Improved time: $improvedFibonacciTime ms")
}


fun fibonacci(num: Int): Long {
    return when (num) {
        0 -> 0L
        1 -> 1L
        else -> fibonacci(num - 2) + fibonacci(num - 1)
    }
}

fun improvedFibonacci(num: Int, a: Long = 0, b: Long = 1): Long {
    println("improved:" + a)
    return when (num) {
        0 -> a
        1 -> b
        else -> improvedFibonacci(num - 1, b, a + b)
    }
}