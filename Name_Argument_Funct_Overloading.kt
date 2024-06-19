fun Sum(a:Int, b:Int):Int
{
    return a+b
}
fun Sum(A:Double, B:Double):Double
{
    return A+B
}

fun main(){
    println(Sum(a=2,b=3))//Named argument only in kotlin to stop confusion for many arguments
    print(Sum(B=2.3,A=4.6))
}