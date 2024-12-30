package chap07.section3


class Point(var x: Int = 0, var y: Int = 10) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

//    operator fun not

    operator fun dec() = Point(--x,--y)

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

}


fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = p1 + p2


    println(point)

}