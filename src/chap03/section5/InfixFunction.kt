package chap03.section5


fun main() {
    // 일반적인 표현법
    val multi = 3.multiply(10)

    // 중위 표현법
    val multi2 = 3 multiply 10
    println(multi)
    println(multi2)
}

infix fun Int.multiply(x:Int):Int{
    return this * x
}