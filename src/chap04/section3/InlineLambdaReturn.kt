package chap04.section3


fun main() {
//    retFunc4()

    val getMessage1 = lambda@ { num:Int ->
        if(num !in 1..100){
            return@lambda "Error"         // non-local return 회피
        }
        "Success"
    }

    val getMessage2 = fun(num:Int):String{
        if(num !in 1..100){
            return "Error"
        }
        return "Success"
    }

    println(getMessage1(991))
    println(getMessage2(991))


}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3, { a, b ->
        val result = a + b
        if (result > 10) return
        println("result: $result")
    })

    println("end of retFunc") // 이 부분도 실행안됨
}


fun retFunc2() {
    println("start of retFunc2")
    inlineLambda(13, 3, lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit
        println("result: $result")
    })

    println("end of retFunc2")
}


fun retFunc3() {
    println("start of retFunc3")
    inlineLambda(13, 3, { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda
        println("result: $result")
    })

    println("end of retFunc3")
}


fun retFunc4() {
    println("start of retFunc4")
    inlineLambda(13, 3, fun(a: Int, b: Int) {
        val result = a + b
        if (result > 10) return
        println("result: $result")
    })

    println("end of retFunc4")
}