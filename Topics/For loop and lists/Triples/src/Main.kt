fun main() {
    var result = 0
    val size = readln().toInt()
    val list = MutableList(size) { readln().toInt() }
    for(i in 0 until list.size - 2) {
        if (list[i] + 1 == list[i + 1] && list[i] + 2 == list[i + 2]) {
            ++result
        }
    }
    print(result)
}