fun main(){
    Person("Damith","Asanka")
    Person()
    Person(LastName = "Kawmadi")

    var ishara = Person()
    ishara.favcolor()
    ishara.myfavcolor="blue"
    ishara.favcolor()
 }


class Person(FirstName : String ="Ishara", LastName :String ="Tharindu"){  //give defult Value
    var FirstName : String? = null
    init {
        println("$FirstName name is $FirstName $LastName")
        this.FirstName=FirstName
    }

    var my_age:Int? = null
    var myfavcolor :String ="Red"

    fun favcolor(){
        println("$FirstName favorite color is $myfavcolor")
    }
}