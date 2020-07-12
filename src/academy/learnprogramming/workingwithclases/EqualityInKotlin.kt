package academy.learnprogramming.workingwithclases

fun main(args: Array<String>) {
    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("Jhon", 2)
    val employee3 = Employee("Jhon", 2)
    val employee4 = employee1

    //    Is a good practice in Kotlin  use == and === instead of equals
    println("employee1 == employee2 is ${employee1 == employee2}")
    println("employee2 == employee3 is ${employee2 == employee3}")
    println("employee1 == employee4 is ${employee1 == employee4}")
    println("employee1 === employee2 is ${employee1 === employee2}")
    println("employee2 === employee3 is ${employee2 === employee3}")
    println("employee1 === employee4 is ${employee1 === employee4}")
    println("employee1.equals(employee2) is ${employee1.equals(employee2)}")
    println("employee2.equals(employee3) is ${employee2.equals(employee3)}")
    println("employee1.equals(employee4) is ${employee1.equals(employee4)}")
    println("employee1.equals(employee2) is ${employee1.equals(employee2)}")
    println("employee2.equals(employee3) is ${employee2.equals(employee3)}")
    println("employee1.equals(employee4) is ${employee1.equals(employee4)}")
}