open class Class1{
    open fun Get(){
         print("Enter the name:")
         var Name=readLine()
         print("Given name is $Name\n")
     }
 }
 
 class Class2:Class1(){
     override fun Get(){
     super.Get()//to get the function of parent class in the derived class
         print("Enter the name of derived class:")
         var Name=readLine()
         print("Given name of second class is $Name\n")
     }
 }
 
 fun main(){
     
     
     var C1=Class1()
     C1.Get()
     
     var C2=Class2()
     C2.Get()
 }
 