
fun main() {
    var A:String?="null"
    A?.let{
        println("Line 1")
        println("Line 2 $A")
        println("Line 3 $it")//it points to same object in the block of let{}. Here it is A.
    }
}
