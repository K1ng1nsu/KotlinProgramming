package chap06.section2

class Person {
    var te :String?=null
    lateinit var name:String

    fun test(){
        if(!::name.isInitialized){
            println("not initialized")
        }else{
            println("initialized")
        }
    }
}

fun main() {

    val person = Person()

    person.test()
    person.name="insu"
    person.test()

}