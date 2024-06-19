fun calculate() {
    print("Enter the first number: ")
    val inputA = readLine()
    val A = inputA?.toInt()

    print("Enter the second number: ")
    val inputB = readLine()
    val B = inputB?.toInt()

    print("Enter the operator: ")
    val inputC = readLine()
    val C = inputC?.firstOrNull()

    if (C == '+') {
        println("The addition of $A and $B is ${A?.plus(B ?: 0)}")
    }
    if (C == '-') {
        println("The difference of $A and $B is ${A?.minus(B ?: 0)}")
    }
    if (C == '*') {
        println("The product of $A and $B is ${A?.times(B ?: 0)}")
    }
    if (C == '/' && B!=0) {
        println("The quotient of $A and $B is ${A?.div(B ?: 1)}")
    }
    
    else{
        println("Not divisible by 0")
    }
}

fun main() {
    calculate()
}
