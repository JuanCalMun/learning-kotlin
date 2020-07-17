package academy.learnprogramming.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("RXB202", 20)
    laserPrinter.printModelName()
    val somethingElse = SomethingElse("Hello")
}


abstract class Printer(val modelName: String) {
    open fun printModelName() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName), MyInterface {
    override fun printModelName() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
    override fun saySomething(str: String): String {
        TODO("Not yet implemented")
    }
}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName, 12) {
    override fun printModelName() = println("this is my way of doing it")

}

open class Something : MySubInterface {

    val someProperty: String
    override val number: Int = 12

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun mySubSaySomething(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun saySomething(str: String): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse : Something {
    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}


interface MyInterface {
    fun saySomething(str: String): String

}

interface MySubInterface : MyInterface {

    val number: Int
    val number50times: Int
        get() = number * 50

    fun mySubSaySomething(num: Int): String

}