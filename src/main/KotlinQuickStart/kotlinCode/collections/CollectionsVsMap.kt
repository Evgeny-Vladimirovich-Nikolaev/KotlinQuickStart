package kotlinCode.collections

fun main() {
    val randomNumber = mutableListOf<Int>()
    for(i in 1..1000) {
        randomNumber.add((Math.random() * 1000).toInt())
    }
    val result = randomNumber.filter{it % 3 == 0 || it % 5 == 0}
        .map{it * it}
        .sortedDescending()
        .map{"$it"}
    println(result)
}