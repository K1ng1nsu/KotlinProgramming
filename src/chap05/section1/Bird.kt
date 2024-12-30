package chap05.section1

class Bird {

    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    constructor(_name: String, _beak: String, _color: String) {
        name = _name
        wing = 2
        beak = _beak
        color = _color
    }

//    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
//        name = _name
//        wing = _wing
//        beak = _beak
//        color = _color
//    }


    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}


class Bird2(var name: String, var wing: Int, var beak: String, var color: String) {

    init {
        // 초기화 블럭
        println("----------start----------")
        println("name of bird: $name, beak is $beak")
        println("-----------end-----------")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

class Bird3 constructor(var name: String, var wing: Int = 2, var beak: String, var color: String) {

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}


fun main() {
    val coco = Bird("Eagle", 2, "short", "Black")

    coco.fly()
    coco.sing(1)

    val coco2 = Bird("Eagle2", "short", "Black")


    val coco3 = Bird2("Eagle", 2, "short", "black")

    val coco4 = Bird3(name = "Eagle", beak = "short", color = "Black")


}