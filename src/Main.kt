import com.example.insu.Person as User

fun main() {
    println("Hello World")

    val person = User("insu",27);
    val person2 = Person(123,"insu","Programmer")

    println(person)
    println(person.name)
    println(person.age)


}

class Person(val no:Int,val name:String,val jobTitle:String)

