package chap04.section1


fun main() {
    println("Enter the score: ")
    val score = readln().toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        in 60.0..69.9 -> grade = 'D'
    }

    println("Score: $score, Grade: $grade")


    val msg = when(score){
        90.0,100.0 -> {"Good!"}
        else -> {"Bad!"}
    }
    println(msg)


}