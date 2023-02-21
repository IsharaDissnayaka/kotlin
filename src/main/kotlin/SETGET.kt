fun main (){
    var car1 =car()

    println("BrandName IS ${car1.brandName}")
    println("BrandName IS ${car1.breakType}")
}

class car(){
    lateinit var name:String

    var breakType ="Brembo"
    var brandName = "bmw"
        get() {
            return field.uppercase()
        }
    init {
        name="GTR"
    }
}