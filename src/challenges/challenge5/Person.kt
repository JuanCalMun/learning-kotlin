package challenges.challenge5

class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }

}