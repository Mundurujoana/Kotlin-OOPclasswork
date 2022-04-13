fun main() {
    //fun main is the entry point of all your kotlin programs.
//we use the one template to built many objects.
   // the class is a template from which to built our object
  //  class is not a category, but a class in oop.
    //object is the instance of a class
    //state is the data an object has(attributes)
    //attributes define the object its self.
    // an object has attributes and behaviours
    //person has attributes(name, age, height, weight, gender,complexion),
// behaviour/function(cat(), sleep(), see(), walk(),talk)())
    ///the   println(toyota.speed) speed of the car is 0 at the stage of creation
    //constructor creates an object
    var nancy = Student("Nancy",45,"Anitab")
    var janet = Student("janrt", 32,"lislab")
    println(nancy)
    println(janet)

    var toyota = Car("Toyota","prado", "KCT 123B", 0)
   toyota.start()
    println(toyota.speed)
    toyota.accelerate(30)
    println(toyota.speed)
    toyota.accelerate(50)
    println(toyota.speed)
    toyota.deccelerate(20)
    println(toyota.speed)
    toyota.hoot()
    println(toyota.speed)
    toyota.stopcar()
    println(toyota.speed)

}

//a class has Name
//The body of a class is denoted by a pair of curly braces
class Car(var make:String, var model:String, var registration:String, var speed:Int){//the constructor
fun start(){
    println("chogio gio gio")
}
        fun accelerate(acceleration:Int):Int{
            speed+=acceleration
            return speed
        }

 fun hoot(){
     println("peeeeeeeeee")
 }
fun deccelerate(decceleration:Int):Int{
    speed-=decceleration
    return speed
}
    fun stopcar(){
speed-=speed
    }
}
data class Student(var name:String, var age:Int, var stream:String)