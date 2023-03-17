fun main() {
    val size = readln().toInt() // size of the list
    val list = MutableList(size) { readln().toInt() } // list of integers
    var position = readln().toInt() // number of positions to rotate
    position %= size // optimization
    repeat(position) {
        list.add(0, list.last()) // add the last element at first place
        list.removeAt(list.size - 1) // remove last element
    }
    println(list.joinToString(" "))
}