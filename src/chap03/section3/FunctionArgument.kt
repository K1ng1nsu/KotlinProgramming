package chap03.section3

fun add(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

fun funcFunc(someFun: (Int, Int) -> Int, a: Int, b: Int): Int {
    return someFun(a, b);
}

fun funcFunc2(someFun: (Int, Int) -> Int, a: Int, b: Int): Int {
    return someFun(a, b);
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String) = println(out("OneParam"))
fun moreParam(out: (String, String) -> String) = println(out("ParamOne", "ParamTwo"))


fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

fun main() {
    val result = add(10, 3)
    val result2 = mul((add(3, 3)), 2)

    funcFunc(::add, 1, 2);
//    funcFunc(add, 1, 2); //에러
    funcFunc2({ x, y -> x + y }, 1, 2)

    val add2 = ::add

    println(add2(3, 3))

    noParam({ "Hello" }) // 소괄호 생략가능
    noParam { "Hello" }

    oneParam({ x -> "Insu $x" }) // 소괄호 생략가능
    oneParam { x -> "Insu $x" }
    oneParam { "Insu $it" } // 인자가 하나면 it으로 대체가능

    moreParam { x, y -> "Hello $x $y" }
    moreParam { _, y -> "Hello $y" } // 생략가능


    twoLambda({ x, y -> "Hello $x $y" }, { "Hello $it" }) // 마지막 람다식은 소괄호에서 빼낼 수 있음
    twoLambda({ x, y -> "Hello $x $y" }) { "Hello $it" }


    val multi = { x: Int, y: Int -> x * y }
    val multi2: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    val multi3: (Int, Int) -> Int = { x, y -> x * y }
    val multi4: (Int, Int) -> Int = { x, y ->
        println("x * y")
        x * y
    }

    println(multi4(1, 2))


    val greet: () -> Unit = { println("Hello") }
    val greet2 = { println("Hello") }

    println(greet)
    println()
    println(greet())

    val nestedLambda: () -> () -> Unit = { { println("World") } }

    nestedLambda()()


}
