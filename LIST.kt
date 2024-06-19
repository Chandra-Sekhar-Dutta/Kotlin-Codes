fun main() {
    val month1 = listOf("January", "February", "March", "April")
    val updatedMonth = month1.toMutableList()
    val newMonth = listOf("May", "June", "July", "August")
    updatedMonth += newMonth
    println(updatedMonth)
    updatedMonth.add("September")
    print(updatedMonth)
    print("\n")
    
    //we can make a mutable list by-
    
    val days=mutableListOf<String>("Sunday","Monday","Tuesday")
    days.add("Wednesday")
    println(days)
    days.remove("Tuesday")//for index- use removeAt(index number)
    println(days)
    days.add(2,"Tuesday")
    println(days)
    days.set(2,"Third day")
    println(days)
    val isPresent1=days.contains("Saturday")
    println(isPresent1)
    val isPresent2=days.contains("Monday")
    println(isPresent2)
}
