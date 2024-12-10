package chap03.section5


fun main() {
    val source = "Hello World!"
    val target = "Kotlin"

    // String에 존재하지 않았던 함수를 추가했음
    println(source.getLongString(target))
}

fun String.getLongString(target:String):String =
    if (this.length > target.length) this else target