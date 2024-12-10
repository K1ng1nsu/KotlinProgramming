package chap02.section3

import kotlin.reflect.typeOf

fun main() {
    var str1: String? = "Hello Kotlin"
    var num: Int? = null

    println("str1: ${str1?.length}, num: $num")
    println("str1: ${str1}, length: ${str1?.length}")

//    val len = if(str1 != null) str1.length else -1
//    println(len)

    val len2 = str1?.length ?: -1
    val test = null ?: 1;
    println(test)


    val a = 1
    val b = 1.1

    // 자료형이 다르면 비교할 수 없음
//    println(a==b)
    val c = 1L + 3
    println(c);

// -128 ~ 127 까지는 캐시에 있는 값을 가져와서 비교하기때문에 다른 결과가 나올 수 있음
    val n1 = 127
//    val n1 = 128

    val n2: Int? = n1
    val n3: Int? = n1
    val n4: Int? = n2
    println(n2 == n3)
    println(n2 === n3)
    println(n2 === n4)

    var n5:Number = 1;
    println(n5 is Long)
    n5=12L
    println(n5 is Long)

    var test1:Any = "dadsa"

    checkArg(test1)

    test1 = 1

    checkArg(test1)
}

fun checkArg(x:Any){
    if (x is String){
        println("x is String: $x")
    }
    if(x is Int){
        println("x is Int: $x")
    }
}