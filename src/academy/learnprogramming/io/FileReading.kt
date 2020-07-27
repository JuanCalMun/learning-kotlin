package academy.learnprogramming.io

import java.io.File

fun main() {
    val file = File("testFile.txt")
    val lines = file.reader().readLines()
    lines.forEach { println(it) }

    val reader = file.reader()
    val readedLines = reader.readText()
    println(readedLines)
    reader.close()

    /**
     *  'use' function close the resources for us
     * */
    val safeReadedLines = file.reader().use { it.readText() }
    println(safeReadedLines)
}