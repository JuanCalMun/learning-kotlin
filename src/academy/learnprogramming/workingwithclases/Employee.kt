package academy.learnprogramming.workingwithclases

class Employee(var name: String, var number: Int) {
    override fun toString(): String {
        return "Employee(name='$name', number=$number)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (number != other.number) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + number
        return result
    }

}