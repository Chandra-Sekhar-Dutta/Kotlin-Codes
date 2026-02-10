class Person(var name: String, var age: Int) {
    var isAdult: Boolean

    init {
        println("Inside init block: Initializing properties")

        // Property initialization based on constructor parameters
        isAdult = age >= 18

        // Data validation
        require(age >= 0) { "Age cannot be negative." }

        // Complex calculations
        val yearOfBirth = 2023 - age

        // Printing debug information
        println("Year of birth: $yearOfBirth")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age, Is Adult: $isAdult")
    }
}

fun main() {
    val P1 = Person("John", 25)
    P1.displayInfo()
}
