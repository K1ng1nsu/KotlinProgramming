package Test


fun main() {

    var result:Long = 2L;

    var first = 1
    var second =2
    while (true) {
        var temp = first+second;
        if(temp%2==0){
            result += temp
        }
        if(temp>=4_000_000){
            break;
        }
        first = second
        second = temp
    }

    println(result)
}
