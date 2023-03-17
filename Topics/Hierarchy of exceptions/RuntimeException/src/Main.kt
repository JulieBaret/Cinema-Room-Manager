fun main() {
    try {
    val x = "hello".toInt()
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}