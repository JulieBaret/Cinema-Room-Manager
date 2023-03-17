fun main() {
    val unit = readln().toInt()
    val category = when {
        unit < 1 -> "no army"
        unit in 1..4 -> "few"
        unit in 5..9 -> "several"
        unit in 10..19 -> "pack"
        unit in 20..49 -> "lots"
        unit in 50..99 -> "horde"
        unit in 100..249 -> "throng"
        unit in 250..499 -> "swarm"
        unit in 500..999 -> "zounds"
        else -> "legion"
    }
    println(category)
}