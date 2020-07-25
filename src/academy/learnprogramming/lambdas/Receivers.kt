package academy.learnprogramming.lambdas

import academy.learnprogramming.workingwithclases.Employee

fun main() {
    println(countToNumWith(100))
    println(countToNumApply(100))
    println(countSimplify(100))

    val employees = listOf(
            Employee("Rick", 74),
            Employee("Morty", 13),
            Employee("Beth", 43))
    searchEmployeeByName(employees, "Rick")
    searchEmployeeByName(employees, "Jerry")
    checkEachEmployeeByName(employees, "Beth")
    checkEachEmployeeByName(employees, "Jerry")

    "I wAnt tHis in UPPercase".apply toUpperCaseString@{
        "And I wANT tHIS in loWERcase".apply {
            println((this@toUpperCaseString).toUpperCase())
            println(toLowerCase())
        }
    }
}

fun countToNumWith(num: Int): String =
        with(StringBuilder()) {
            for (i in 0..num)
                append(if (i == (0 or num)) "$i " else "$i, ")
            toString()
        }

fun countToNumApply(num: Int): String =
        StringBuilder().apply {
            for (i in 0..num)
                append(if (i == (0 or num)) "$i " else "$i, ")
        }.toString()

fun countSimplify(num: Int): String =
        (0..num).joinToString()

fun searchEmployeeByName(employees: List<Employee>, name: String) =
        run {
            employees.forEach {
                if (it.name == name) {
                    println("Yes, there is a employee with name $name: $it")
                    return
                }
            }
            println("No there is no employees with name $name")
        }

fun checkEachEmployeeByName(employees: List<Employee>, name: String) =
        run {
            employees.forEach customForEachName@{
                if (it.name == name) {
                    println("Yes, the employee's name is $name: $it")
                    return@customForEachName
                }
                println("No the employee's name ${it.name} is different from $name ")
            }
        }