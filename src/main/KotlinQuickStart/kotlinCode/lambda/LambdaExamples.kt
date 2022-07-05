package kotlinCode.lambda

val squareArea: (Int) -> Int = { it * it }
val rectanglePerimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
val hello: (String) -> Unit = { println("Hello, $it!") }
val sorter: (Array<Int>) -> Array<Int> = {
    for (i in 0 until it.size - 1) {
        var max = i
        for (j in i + 1 until it.size) {
            if (it[j] > it[i]) max = j
        }
        if (it[i] != max) {
            val temp: Int = it[i]
            it[i] = it[max]
            it[max] = temp
        }
    }
    it
}

fun main() {
    println(squareArea(5))
    println(rectanglePerimeter(3, 2))
    hello("Nobilis")
    val sortedArray = sorter(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    for(i in sortedArray) {
        println(i)
    }
}


