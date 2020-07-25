package academy.learnprogramming.lambdas

import academy.learnprogramming.workingwithclases.Employee

fun main(args: Array<String>) {
    run { println("I'm inside a lambda") }

    var num = 10
    run {
        num += 5
        println(num)
    }
    println(num)

    val employees = listOf(
            Employee("Rick", 74),
            Employee("Morty", 13),
            Employee("Beth", 43))
    printEmployees(employees)

    println("Minimum: " + employees.minBy(Employee::number))
    println("Sort by number: " + employees.sortedBy(Employee::number))
    println("Sort by number desc: " + employees.sortedByDescending(Employee::number))
    println("Filtered name with 't': " + employees.filter { it.name.toLowerCase().contains('t') })
}

fun printEmployees(employees: List<Employee>) =
        employees.forEach { println("Employee ${it.name} with number ${it.number}") }
