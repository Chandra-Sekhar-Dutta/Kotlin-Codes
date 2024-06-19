data class Fruit(var name:String, var price:Int)

fun main() {
    val A = arrayOf(1, 2.2, 3, "hello", 5, 6, true, 8, 9)
    
    // Iterate through the array and print each element
    for (element in A) {
        print("$element ")
    }
    print("\n")
    for (element in 0 until A.size) {
        print("element ${A[element]} is at $element \n")
    }
    println("\nSize =${A.size}")

    
    println(A.contentToString())
    //contentToString() is a useful function provided by the standard library 
    //that converts an array or collection into a human-readable string.

    A[0]=10 
    
    print("\n")
    
    println(A.contentToString())
    
    var fruit=arrayOf(Fruit("Apple",45),Fruit("Banana",50))
    print(fruit.contentToString())
}