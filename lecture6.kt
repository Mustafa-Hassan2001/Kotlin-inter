class Car {
  var brand = ""
  var model = ""
  var year = 0
} 

fun main(){
// // Create a c1 object of the Car class
// val c1 = Car()

// // Access the properties and add some values to it
// c1.brand = "Ford"
// c1.model = "Mustang"
// c1.year = 1969

// println(c1.brand)   // Outputs Ford
// println(c1.model)   // Outputs Mustang
// println(c1.year)    // Outputs 1969 

val c1 = Car()
c1.brand = "Ford"
c1.model = "Mustang"
c1.year = 1969

val c2 = Car()
c2.brand = "BMW"
c2.model = "X5"
c2.year = 1999

println(c1.brand)  // Ford
println(c2.brand)  // BMW
}


class Car {
  var brand = ""
  var model = ""
  var year = 0
}

fun main() {
  val c1 = Car()
  c1.brand = "Ford"
  c1.model = "Mustang"
  c1.year = 1969
}

class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
}


// ample
class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  val c2 = Car("BMW", "X5", 1999)
  val c3 = Car("Tesla", "Model S", 2020)
}




class Car(var brand: String, var model: String, var year: Int) {
  // Class function
  fun drive() {
    println("Wrooom!")
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  
  // Call the function
  c1.drive()
}



// Superclass
open class MyParentClass {
  val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x) // x is now inherited from the superclass
  }
}

// Create an object of MyChildClass and call myFunction
fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
} 
