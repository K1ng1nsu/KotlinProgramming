package chap06.section3


open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object:Superman(){ // 하위 클래스를 만들지 않고도 새로운 구현인 fly()를 포함할 수 있음
        override fun fly() {
            println("I'm not a real superman, I can't fly!")
        }
    }

    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()

}
