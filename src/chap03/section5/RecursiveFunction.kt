package chap03.section5


fun main() {
    val number = 4 // 40000 넣으면 stack overflow

    val result: Long

    result = factorial2(number);
    println("Factorial: $number -> $result")

//    val result2 = factorial2(5);

}

// 일반적인 재귀함수
fun factorial(n:Int):Long{
    return if(n==1) n.toLong() else n * factorial(n-1)
}

// 꼬리 재귀 함수
tailrec fun factorial2(n:Int, run:Int =1):Long{
    return  if(n==1) run.toLong() else factorial2(n-1,run*n)
}