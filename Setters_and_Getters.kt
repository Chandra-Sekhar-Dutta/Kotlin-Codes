class RightToVote {
    var age: Int = 0
        set(value) {
            if (value >= 18) {
                field = value   //field and value are the keywords
            } 
            
            else {
                println("Not eligible to vote")
            }
        }
        get(){
            return field
        }
        
        fun allowedToVote(){
            print("Allowed to Vote")
        }
}

fun main() {
    print("Enter your age: ")
    var age = readLine()?.toIntOrNull()
    
    if (age != null) {
        val person = RightToVote()
        person.age = age // Using the custom setter to set the age
        person.allowedToVote()
    }
    
}

