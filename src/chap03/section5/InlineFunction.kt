package chap03.section5

fun main() {
    shortFunc(3){ println("First call: $it") }
    shortFunc2(5){ println("Second call: $it") }
}

inline  fun  shortFunc(a:Int, out: (Int) -> Unit){ // 인라인 지우고 키고 디컴파일 해보셈
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

inline  fun  shortFunc2(a:Int, noinline out: (Int) -> Unit){ // 인라인 지우고 키고 디컴파일 해보셈
    println("Before calling out()")
    out(a)
    println("After calling out()")
}