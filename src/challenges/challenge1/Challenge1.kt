package challenges.challenge1

fun main(args: Array<String>) {

    /*  Declare two inmutable Strings variables called hello1 and hello2
        Assign "Hello" to both variables */
    val hello1 = "Hello"
    val hello2 = "Hello"

    /*  Using one line of code
        test whether hello1 and hello2 are referentially equal and print the results */
    println("hello 1 is referentially equal to hello2 ${hello1 === hello2}") //true

    /*  Do the same thing as above, but test for structural equality */
    println("hello 1 is structurally equal to hello2 ${hello1 == hello2}") //true

    /*  Declare a mutable variable of type Int and assign it the value of 2988 */
    var number = 2988

    /*  Declare a immutable variable of type Any
        Assign it the string "The Any type is the root of the kotlin class hierarchy"
        Using a smart cast, print out uppercased string */
    val anything: Any = "The Any type is the root of the kotlin class hierarchy"
    if (anything is String) {
        println("The uppercase string is: ${anything.toUpperCase()}")

    }

    /*  Using one line of code, print the following 
            1   
           11
          111
         1111  
     */
    println("""    1
    |   11
    |  111
    | 1111""".trimMargin())


}