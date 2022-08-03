package kotlinCode.higherOrderFunctions

fun main() {
    val list = (1..10).toList()
    val sum = collectionSum(list) { it.sum()}
    println(sum)
}

inline fun collectionSum(currentList: List<Int>, sum: (List<Int>) -> Int) : Int{
    return sum(currentList)
}
