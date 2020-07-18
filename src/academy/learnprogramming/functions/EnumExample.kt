package academy.learnprogramming.functions

fun main(args: Array<String>) {
    println(EnumExample.HELLO)
    println(EnumExample.HELLO.getExampleInfo())
}

enum class EnumExample(private val firstName: String, private val number: Int) {
    HELLO("HELLO", 3),
    BYE("BYE", 3),
    THIS("THIS", 3),
    IS("IS", 3),
    A("A", 3),
    TEST("TEST", 3);

    fun getExampleInfo() = "The value of $firstName is $number"
}
