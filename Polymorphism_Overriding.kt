open class shape {
    open fun area(): Double {
        print("The area is -\n")
        return 0.0
    }
    open fun show(){
        print("This is class shape")
    }
}

class Rectangle(var len_dim: Double, var breadth_dim: Double) : shape() {
    override fun area(): Double {
        return len_dim * breadth_dim
    }
}

class Square(var edge_dim: Double) : shape() {
    override fun area(): Double {
        return edge_dim * edge_dim
    }
}

class Triangle(var Base:Double,var Height:Double):shape(){
   override fun area(): Double {
       return 0.5*Base*Height
   } 
}

fun main() {
    print("Enter the length of the Rectangle: ")
    var len_dim = readLine()?.toDoubleOrNull()

    print("Enter the breadth of the Rectangle: ")
    var breadth_dim = readLine()?.toDoubleOrNull()

    print("Enter the edge of the square: ")
    var edge_dim = readLine()?.toDoubleOrNull()
    
    print("Enter the base of the Triangle: ")
    var Base = readLine()?.toDoubleOrNull()

    print("Enter the Height of the Triangle: ")
    var Height = readLine()?.toDoubleOrNull()
    

    if (len_dim != null && breadth_dim != null) {
        var R1 = Rectangle(len_dim, breadth_dim)
        println("Rectangle Area: ${R1.area()}")
    }

    if (edge_dim != null) {
        var S1 = Square(edge_dim)
        println("Square Area: ${S1.area()}")
    }
    
     if (Base != null && Height != null) {
        var T1 = Triangle(Base, Height)
        println("Triangle Area: ${T1.area()}")
        
        T1.show()//this function dsoesn't exist in triangle class. still it inherites the function.

        if(T1 is Triangle){
            print("\nT1 is an object of the class Triangle")//type checking.
        }
    }
}
