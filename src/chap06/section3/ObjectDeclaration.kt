package chap06.section3


object OCustomer{
    var name = "insu"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("Soccer")
    init{
        println("Init!")
    }

}

class Hobby{
    val name:String
    constructor(name:String){
        println("Hobby Created")
        this.name= name
    }
}

fun main() {
    OCustomer.greeting()
    OCustomer.name = "insu2"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

}
