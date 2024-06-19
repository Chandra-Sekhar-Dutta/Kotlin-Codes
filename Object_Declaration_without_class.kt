open class Base(){
    fun Print(){
        print("\nInheriting from the base class...\n")
    }
}
//class and the object are made when one object is declared directly and only one object can be made with that class.
object A:Base(){
    var a:Int=10
    fun show(){
        print(a)
    }
}

object B:Base()

fun main() {
    A.show()
    A.Print()
    B.Print()
}