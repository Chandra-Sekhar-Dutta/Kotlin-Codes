fun main() {
    var a = readLine()?.toIntOrNull()

    when (a) {
        1 -> print("one")
        2 -> print("two")
        3 -> {
            println("Three")
        }
        4,5,6->{
            println("More than two")
            println("$a")
        }
        else -> {
            if (a != null) {
                print(2 * a)
            } else {
                println("Invalid input")
            }
        }
    }
    print("\n")
    var b=readLine()?.toIntOrNull()
    
    when(b){
        in 0..9->println("Positive single digit")
        in 0 downTo -9->println("Negative single digit")
        else->
        if(b!=null){
            if(b>0 && b>9){
                println("Positive number")
            }
            else{
                println("Negative number")
            }
        }
        else{
            println("Invalid input")
        }
    }
}
