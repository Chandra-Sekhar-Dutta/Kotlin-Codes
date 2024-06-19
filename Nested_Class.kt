class Outer {
    fun outerFun() {
        println("This is outer class")
    }

    class Nested1 { //Nested class cannot exist on its own and cannot access the elements of the outer class
        fun nestedFun1() {
            println("This is nested class1")
        }
    }

    inner class Nested2 {
        fun nestedFun2() {
            println("This is nested class2")
        }

        fun outerFun() {
            println("This is outer class function from nested class2")// inner class can access the Outer class's elements
        }
    }
}

fun main() {
    val out = Outer()
    out.outerFun()

    val nest1 = Outer.Nested1()
    nest1.nestedFun1()

    val nest2 = out.Nested2()
    nest2.nestedFun2()
    nest2.outerFun()
}