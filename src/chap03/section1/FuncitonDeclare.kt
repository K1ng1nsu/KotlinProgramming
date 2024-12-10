package chap03.section1


fun main() {
    val result1 = add(3,2)
    val result2 = add1(6,7)

    println(result1)
    println(result2)

    printSum(3,5)

    printNameAndEmail("insu","insu9058@naver.com")
    printNameAndEmail("insu2")

    println(namedParam(c=100))

    normalVarargs(1,2,3,4,5,6)

    val multi = {x:Int,y:Int -> x*y}
    println(multi(10,20))

    val multi2: (Int, Int) -> Int = { x, y -> x * y }

}


fun add(a: Int, b: Int): Int {
    return a + b
}
fun add1(a:Int,b:Int) = a+b

fun max(a:Int,b:Int) = if (a>b) a else b

fun printSum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}

fun printNameAndEmail(name:String, email:String ="default"){
    println("name: $name, email: $email")
}

fun namedParam(a:Int=100,b:Int=200,c:Int) = a+b+c

fun normalVarargs(vararg counts: Int){
    for(num in counts){
        println(num)
    }
}