package academy.learnprogramming.starter

fun main(args: Array<String>) {
    val nurseryRhyme = """nurseryRhyme
                        Humpty Dumpty sat on the wall
                        Humpty Dumpty had a great fall
                        All the king's horses and all the king's men
                        Couldn't put Humpty together again."""

    val nurseryRhymeTrim = """--- nurseryRhymeTrim ---
                            *Humpty Dumpty sat on the wall
                            *Humpty Dumpty had a great fall
                            *All the king's horses and all the king's men
                            *Couldn't put Humpty together again.""".trimMargin("*")

    val nurseryRhymeDefaultTrim = """*** nurseryRhymeDefaultTrim ***
                            |Humpty Dumpty sat on the wall
                            |Humpty Dumpty had a great fall
                            |All the king's horses and all the king's men
                            |Couldn't put Humpty together again.""".trimMargin()

    println(nurseryRhyme)
    println(nurseryRhymeTrim)
    println(nurseryRhymeDefaultTrim)
}