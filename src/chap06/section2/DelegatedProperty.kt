package chap06.section2

import kotlin.properties.Delegates


class User {
    var name: String by Delegates.observable("NONAME") { prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    println(user.name)
    user.name = "insu1"
    println(user.name)
    user.name = "insu2"
    println(user.name)


    var max:Int by Delegates.vetoable(0){
        prop,old,new ->
        new >old
    }

    println(max)
    max = 10
    println(max)

    max =5
    println(max)


}