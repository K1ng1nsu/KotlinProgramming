package chap06.section1

class Person(_id: Int, _name: String, _age: Int) {
    var id = _id
        get() {return field}
        set(value) {field=value}
    val name =_name
        get() {return field}
    val age = _age
        get() {return field}

}

fun main() {
    val person = Person(1, "insu", 27)

    person.id = 2

    println(person.id)


}