package academy.learnprogramming.functions

fun main(args: Array<String>) {

    val car1 = Car("red", 2000)
    val car2 = Car("blue", 2010)
    val car3 = Car("orange", 2020)

    printCarColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)
    /*Spread operator *manyCars */
    printCarColors(*manyCars)

    println(tinySumFunction(3, 4))

    val text = "first and last upper case"
    println(Utils().upperFistAndLast(text))
    println(text.newWayUpperFistAndLast())
}

class Car(val color: String, val year: Int)

fun printCarColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun tinySumFunction(a: Int, b: Int) = a + b

fun String.newWayUpperFistAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase()
    val upperLast = substring(length - 1, length).toUpperCase()
    return upperFirst + substring(1, length - 1) + upperLast
}



