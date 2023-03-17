fun main(args: Array<String>) {
    val num = readln().toInt()
    val shape = when (num) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> "There is no such shape!"
    }
    println(if (num in 1..4) "You have chosen a $shape" else shape )
}