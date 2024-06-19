fun main() {
    println("The value of a=")
    val a = readLine()?.toFloatOrNull() ?: 0.0f
    println("The value of b=")
    val b = readLine()?.toFloatOrNull() ?: 0.0f

    try {
        val c: Float = a / b
        println(c)
    } catch (e: Exception) {
        println("Cannot divide by 0")
    } finally {
        println("Finish")
    }
}