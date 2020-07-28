package academy.learnprogramming.io

import java.io.File

fun main() {
    File(".").walkTopDown().forEach { println(it) }
    File(".").walkTopDown()
            .filter { it.name.endsWith(".kt") }
            .forEach { println(it) }
}