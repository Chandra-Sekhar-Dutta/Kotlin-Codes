fun main() {

    var x: String? = "nUll"
    var y = x ?: "0"  // elvis operator
    println(y)
    println(y!!.toUpperCase())
}
