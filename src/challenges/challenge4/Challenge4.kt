package challenges.challenge4

import kotlin.random.Random

fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    for (i in 0..5000 step 5) println(i)

    // using a range, -500..0, each number on a separate line
    for (i in -500..0) println(i)

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...
    for (i in 0..15) {
        println(fibonacci(i))
    }


    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    println("======= START =======")
    for (i in 1..5) {
        println(i)
        if (i == 2) break
        breakableLoop@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) break@breakableLoop
            }
        }
    }
    println("=======  END  =======")


    // Declare a variable called num (int) and assign it whatever you want

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    // Then print the value of dnum - separate statement
    
    val num = Random.nextInt(0, 200)
    val dnum = when {
        num < 100 -> 4444.555
        num > 100 -> -234.567
        else -> 0.0
    }
    println("The num is $num and the result is $dnum")
}

fun fibonacci(num: Int): Int {
    return when (num) {
        0 -> 0
        1 -> 1
        else -> fibonacci(num - 2) + fibonacci(num - 1)
    }
}