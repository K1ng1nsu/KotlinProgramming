package Test


fun main() {
    var result:Int =0
    for(x in 1 .. 999){
        if(x%3==0 || x%5==0){
            result += x

        }
    }

    println(result)

    var result2 :Int = 0

    var sumOfT3 = (501)*333
    var sumOf5 = (500) * 199

    var sumOf15 = (1005) * 990/15/2

    result2 =sumOfT3+sumOf5-sumOf15

    println(result2)


}