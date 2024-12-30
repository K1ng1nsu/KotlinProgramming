package chap06.section3


class Person3{
    var id:Int = 0
    var name:String = "insu"

    companion object{
        var language:String = "Korean"
        fun work(){
            println("working...")
        }
    }

}

fun main() {
    println(Person3.language)
    Person3.language ="English"
    println(Person3.language)
    Person3.work()

}