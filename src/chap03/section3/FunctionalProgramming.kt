package chap03.section3


fun main() {
    val multi = { x: Int, y: Int -> x * y }
    println(multi(10, 20))

    val multi2: (Int, Int) -> Int = { x, y -> x * y }


}