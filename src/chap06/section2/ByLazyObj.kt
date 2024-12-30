package chap06.section2

class Person2(val name: String, val age: Int)

fun main() {
    var isPersonInstiated = false

    val person by lazy {
        isPersonInstiated = true
        Person2("kim", 27)
    }

    val personDelegate = lazy { Person2("insu", 27) }

    println("person Init: $isPersonInstiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name : ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")


}
