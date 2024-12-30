package chap07.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double) { // 비 추상 프로퍼티
    abstract val maxSpeed: Double // 추상 프로퍼티

    var year: String = "2008" // 비 추상 프로퍼티

    //추상 메소드
    abstract fun start()
    abstract fun stop()

    // 비 추상 메소드
    fun displaySpec() {
        println("name: $name, color: $color, weight: $weight, max speed: $maxSpeed") // maxSpeed를 구현해야만 이 추상 클래스의 비 추상 메소드를 사용할 수 있기 때문에 추상프로퍼티 사용가능
    }


}

class Car(name: String, color: String, weight: Double, override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn() {
        println("Auto Pilot On")
    }

}


class Motorbike(name: String, color: String, weight: Double, override val maxSpeed: Double) :
    Vehicle(name, color, weight) {

    override fun start() {
        println("Motorbike Started")
    }

    override fun stop() {
        println("Motorbike Stopped")
    }

}

fun main() {
    val car = Car("Matiz","red",1000.0,100.0)
    val motor = Motorbike("Motor1","red",1000.0,100.0)

    car.year = "2014"
    car.displaySpec()

    motor.displaySpec()
    car.start()
    motor.start()

    var v:Vehicle =car
    v.start()

    v = motor
    v.start()



}