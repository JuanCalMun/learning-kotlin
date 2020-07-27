package challenges.challenge5

fun main() {

    /**
     * Create a Person class to allow the deconstructing of the values
     * */
    val joe = Person("Joe", "Jones", 45)
    val (fName, lName, age) = joe
    println("fName = $fName , lName = $lName, age = $age")

    /**
     *  Create a map with all this Person with the key the $lastName and the value the Person
     *  */
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val jhon = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)
    val persons = mapOf(
            jane.lastName to jane,
            mary.lastName to mary,
            jhon.lastName to jhon,
            jean.lastName to jean
    )

    /**
     *  Print how many people has names with 's'
     *  */
    println("============ Print how many people has names with 's' ============ ")
    println(persons.filter { it.value.lastName.toUpperCase().startsWith('S') }.count())
    persons.filter { it.value.lastName.toUpperCase().startsWith('S') }
            .map { println(it) }

    /**
     *  Create a list of pairs with the first name and the last name of the $persons
     *  */
    println("============ Create a list of pairs ============ ")
    val namePairs = persons.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    /**
     *  Use the also function to print
     *  Joe is 45 years old
     *  Jane is 12 years old
     *  etc...
     *  */
    println("============ Using also ============ ")
    persons.also { it.map { println("${it.value.firstName} is ${it.value.age} years old") } }

    /**
     *  Obtain a list of integers with only the values present in two lists
     *  */
    println("============ Intersect list ============ ")
    val listOne = listOf(1, 4, 9, 15, 33)
    val listTwo = listOf(4, 55, -83, 22, 101, 15)

    val intersectList = listOne.intersect(listTwo)
    println(intersectList)

//    val intersectList = listOne.filter { it in listTwo }
//    val intersectList = listOne.filter { listTwo.contains(it) }

    /**
     *  Make this line compile
     *
     * sol: added 'out' to class Box<out T>
     *  */
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper


}