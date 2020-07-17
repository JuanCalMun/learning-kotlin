package academy.learnprogramming.functions

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "our company rocks!"
    fun getCopyrightLine() = "Copyright\u00A9 $currentYear Our Company. All rights reserved"
}