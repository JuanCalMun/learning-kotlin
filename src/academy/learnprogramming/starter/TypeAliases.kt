package academy.learnprogramming.starter

typealias StringList = MutableList<String>

fun main(args: Array<String>) {
    val names: StringList = mutableListOf()
    names.add("Ana")
    names.add("Pepe")
    names.add("Antonio")

    println(names)
}
