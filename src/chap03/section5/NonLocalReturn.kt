package chap03.section5


fun main() {
    shortFunc3(3){
        println("First call: $it")
//        return   // non-local return  이 부분이 crossinline 키워드가 있을경우 에러뜸
    }
}

inline fun shortFunc3(a:Int, crossinline out:(Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}