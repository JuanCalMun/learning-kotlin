package academy.learnprogramming.functions

class Utils {
    fun upperFistAndLast(str: String): String {
        val totalLength = str.length
        val upperFirst = str.substring(0, 1).toUpperCase()
        val upperLast = str.substring(totalLength - 1, totalLength).toUpperCase()
        return upperFirst + str.substring(1, totalLength - 1) + upperLast
    }
}