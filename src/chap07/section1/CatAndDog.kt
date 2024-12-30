package chap07.section1

interface Pet {
    var species:String
    var category: String // abstract 키워드가 없어도 모든게 추상



    fun feeding()
    fun patting() {
        println("Keep patting!")
    }

}

open class Animal(val name:String)


class Cat(name:String,override var category: String) :Animal(name), Pet {
    override var species: String = "cat"

    override fun feeding() {
        println("Yamm")
    }

}


class Dog(name: String,override var category: String):Animal(name),Pet{
    override var species: String="dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(pet: Pet){
        println("Enjoy with ${pet.species}")
    }
}

fun main() {
    val master = Master()

    val dog = Dog("wilson", "Small")
    val cat = Cat("julia","BigFat")

    master.playWithPet(dog)
    master.playWithPet(cat)

}