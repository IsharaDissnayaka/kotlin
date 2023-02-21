fun main(){

}

open class Car(val name : String,var brand : String){
        fun driving(distance : Double){
            println ("This car can be driven $distance")
        }
  open  var range:Int = 200

    open fun carrange(){
        println("car rangeis $range km")
    }
}

class Electric(name: String, brand: String,BatteryLife : Int) : Car(name, brand){
    override var range:Int=
}