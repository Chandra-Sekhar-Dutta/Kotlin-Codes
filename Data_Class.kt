data class Information(var name: String, var age: Int) 
//there must one parameter to define a data class
//a data class is a class that is specifically designed to hold data. 
//It's often used to represent simple entities with no behavior other than storing and providing access to their data.
fun main() {
    print("Enter your name: ")
    var name = readLine()
    print("Enter your age: ")
    var age = readLine()?.toIntOrNull()

    if (name != null && age != null) {
        var person1 = Information(name, age)
        var person2 =Information(name, age)
        var person3:Information=person1.copy(age=49)//here the object is copied but we can change the data of the object
        println("\nName is ${person1.name}")
        println("Age is ${person1.age}\n")
        
        println(person1 == person2)
        print("\n")
        //== or equal function returns boolean value based on the values of the agruments given for the n number of abjects.

        
        println(person1)
        println(person2)
        println(person3)
    } 
    
}
