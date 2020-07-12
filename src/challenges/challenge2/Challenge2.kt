package challenges.challenge2

import challenges.challenge2.java.JavaClass

fun main(args: Array<String>) {


    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    var float1: Float
    float1 = -3847.384F
    var float2 = -3847.384F


    // 2. Now change both of those variable declarations into nullable variables.
    var float3: Float? = -3847.384F
    var float4: Float?
    float4 = -3847.384F

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val numbersFiveArray = Array(40) { i -> ((i + 1) * 5) }
    numbersFiveArray.map { number -> println("Int $number") }

    // 4.1 Now declare an array of nullable Shorts and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val shortsNumbersFiveArray = Array<Short>(40) { i -> ((i + 1) * 5).toShort() }
    shortsNumbersFiveArray.map { number -> println("Short $number") }

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val charArray = charArrayOf('a', 'b', 'c')
    JavaClass.method1(charArray);


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    val y: String? = null
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val lowerCase1 = x?.toLowerCase() ?: "I give up!"
    val lowerCase2 = y?.toLowerCase() ?: "I give up!"
    println(lowerCase1)
    println(lowerCase2)


    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    val lowerCase3 = x?.let { it.toLowerCase().replace("am", "am not") }
    val lowerCase4 = y?.let { it.toLowerCase().replace("am", "am not") }
            ?: "I totally give up!"
    println(lowerCase3)
    println(lowerCase4)


    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble() //Exception
}
