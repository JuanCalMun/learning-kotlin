package academy.learnprogramming.workingwithclases

fun main(args: Array<String>) {
    val names = arrayListOf("John", "Jhane", "Mary")
    val numbers = arrayListOf(1, 2, 3)

    val employee1 = Employee(names[0], numbers[0])

    val employee2 = Employee(number = numbers[1], name = names[1])

    val employee3: Employee
    employee3 = Employee(names[0], numbers[0])
    employee3.name = "Peter"

    println(employee1)
    println(employee2)
    println(employee3)
}