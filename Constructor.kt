class Person(var Name:String, var Age:Int){
    fun Age_validity(Age:Int){
        if(Age>=18){
            print("You are elligible")
        }
        
        else{
            print("Not elligible")
        }
    }
}

fun main() {
print("Enter your name:")
val Name=readLine()
print("Enter your age:")
val Age=readLine()?.toIntOrNull()

if(Name!=null && Age!=null){
    var P1=Person(Name,Age)
    P1.Age_validity(Age)
}
}
