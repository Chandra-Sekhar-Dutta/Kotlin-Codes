fun main(){
    val Fruits=setOf("Banana","Apple","Apple","Mango","Qwiwi","Pinapple")
    println(Fruits)
    println("The sorted set is- ${Fruits.toSortedSet()}")
    
    val NewFruits=Fruits.toMutableList()
    NewFruits.add("Grape")
    NewFruits.add("Orange")
    NewFruits.add("Banana")
    
    println("New set of Fruits-$NewFruits")
    println("Sorted set of NewFruits-${NewFruits.toSortedSet()}")
    print("Fruit at position 3=${NewFruits.elementAt(3)}")
}