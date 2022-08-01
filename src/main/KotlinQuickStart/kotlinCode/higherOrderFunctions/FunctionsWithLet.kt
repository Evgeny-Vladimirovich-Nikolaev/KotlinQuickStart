package kotlinCode.higherOrderFunctions

val randomNumbers: MutableCollection<Int>? = mutableListOf()

fun main() {
    randomNumbers?.let {
        with(randomNumbers) {
            for (i in 1..1000) {
                add((Math.random() * Integer.MAX_VALUE).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for(i in result)
            {
                println(i)
            }
        }
    }
}
