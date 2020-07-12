package academy.learnprogramming.workingwithclases

fun main(args: Array<String>) {
    val employee = Employee("Jhon", 1)
    var something: Any

    something = employee
    println("something = Employee")
    doChecks(something)

    something = "Now im String"
    println("something = String")
    doChecks(something)

    something = "Now im String"
    println("something = Int")
    doChecks(something)

}

fun doChecks(something: Any) {
    if (something is Employee) {
        println("the Employee has name ${something.name}")
    }
    if (something !is Employee) {
        println("Is not employee")
    }
    if (something is Int) {
        println("something is a Int: $something")
    }
    if (something is String) {
        println("something is a String: $something")
    }
}