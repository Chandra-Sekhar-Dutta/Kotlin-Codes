fun main(){
    val Days=mapOf(1 to "Monday",2 to "Tuesday", 3 to "Wednesday")
    println(Days[3])
    print("\n")
    
    for(i in 1..3){
        println("${Days[i]} ")
    }
    print("\n")
    
    for (j in Days){
        println("$j")
        
    }
}