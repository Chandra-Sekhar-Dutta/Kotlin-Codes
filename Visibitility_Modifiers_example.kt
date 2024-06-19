open class Vehicle(var Name: String, var Price: Int) {

    open internal fun get_data() {
        print("Enter the name of the vehicle: ")
        Name = readLine().toString()
        print("Enter the price of the vehicle: ")
        Price = readLine()?.toIntOrNull() ?: 0
    }

    open internal fun show() {
        println("The name of the vehicle is -> $Name")
        println("The cost of the vehicle is -> $Price")
    }
}

class Car(name: String, price: Int) : Vehicle(name, price) {
    var Colour: String = ""

    override fun get_data() {
        super.get_data()
        print("Enter the color of the car: ")
        Colour = readLine().toString()
    }

    override fun show() {
        super.show()
        println("The Color of the car is -> $Colour")
    }
}

fun main() {
    val C1 = Car("", 0)
    C1.get_data()
    C1.show()
}
