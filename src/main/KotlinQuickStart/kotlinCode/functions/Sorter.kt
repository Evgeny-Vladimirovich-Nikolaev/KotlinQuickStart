package kotlinCode.functions

fun main() {
    var i = 5;
    val numbers = Array(7,  {i--})
    println(sort(numbers))

    println(sort(arrayListOf(15, 14, 1, 2, 1, 0, -11)))
    println(sort(6, 4, 2, 0, -2))
    println(sort())
}

fun sort(vararg numbers: Int): List<Int> {
    return sort(numbers.toTypedArray())
}

fun sort(list: List<Int>): List<Int> {
    return sort(list.toTypedArray())
}

fun sort(array: Array<Int>): List<Int> {
    for (i in array.size - 1 downTo 1) {
        for (j in 0 until i) {
            if (array[i] < array[j]) swap(array, i, j)
        }
    }
    return array.asList()
}

fun swap(list: Array<Int>, i: Int, j: Int) {
    val temp: Int = list[i]
    list[i] = list[j]
    list[j] = temp
}
