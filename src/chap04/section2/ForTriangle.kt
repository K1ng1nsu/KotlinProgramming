package chap04.section2


fun main() {
    print("Enter the lines: ")
    val n = readln()!!.toInt()

    for(line in 1..n){
        for(space in 1..(n-line)) print(" ")
        for(star in 1..<2*line) print("*")
        println()
    }


}