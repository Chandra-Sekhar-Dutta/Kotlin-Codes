open class base1(var name: String, var Age: Int) {
    fun get_details() {
        println("Your name is: $name")
        println("Your age is: $Age")
    }
}

class base2(name: String, age: Int) : base1(name, Age) {
    fun print() {
        println("Thank you")
    }
}

fun main() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (name != null && age != null) {
        var b2 = base2(name, age)
        b2.get_details()
        b2.print()
    }
}
