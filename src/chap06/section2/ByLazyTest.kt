package chap06.section2

class LazyTest {
    init {
        println("init block") //1
    }

    val subject by lazy  {
        println("lazy initialized") //4
        "Kotlin Programming"
    }

    fun flow(){
        println("not initialized") //3
        println("subject one:$subject") //5
        println("subject two:$subject") //6
    }
}

fun main() {
    val test = LazyTest()
    println("121212") //2
    test.flow()
}