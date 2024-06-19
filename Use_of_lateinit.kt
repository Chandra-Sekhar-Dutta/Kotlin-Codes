class Student {
    lateinit var name: String
    
    fun show() {
        println("Name is $name")
    }
}

fun main() {
    print("Enter the name: ")
    var studentName = readLine() ?: ""
    
    val S1 = Student()
    S1.name = studentName// Initialize the 'name' property using 'lateinit' should be done outside the class where lateinit is used
    S1.show()
}
