package kotlinCode.higherOrderFunctions

val randomNumbers = mutableListOf<Int?>()

fun main() {
    with(randomNumbers) {
        for(i in 1..1000) {
            add((Math.random() * Integer.MAX_VALUE).toInt())
        }
        println(randomNumbers.first())
    }
}
