class Car(var Name: String, var Car_Id: String, var Car_price: Int) {

    fun show() {
        println("The name of the car is $Name")
        println("The car number of the car is $Car_Id")
        println("The price of the car is $Car_price")
    }
}

fun main() {
    print("Enter the car name: ")
    val name = readLine()

    print("Enter the car number: ")
    val car_Id = readLine()

    print("Enter the price: ")
    val car_price = readLine()?.toIntOrNull()

    if (name != null && car_Id != null && car_price != null) {
        val mercedes = Car(name, car_Id, car_price)
        mercedes.show()
    } else {
        println("Invalid input. Please enter valid values for name, car number, and price.")
    }
}
