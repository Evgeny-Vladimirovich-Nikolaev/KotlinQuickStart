package kotlinCode.conditionsVsLoops

    fun main() {
        var array = arrayOfNulls<Int?>(101)
        for (i in 0..100) {
            array[i] = i
        }
        for (i in 0..100) {
            println(array[i])
        }
        array = arrayOfNulls<Int?>(301)
        for(i in 0..300) {
            array[i] = i + 300
        }
        for(i in array.size - 1 downTo 0 step 5) {
            println(array[i])
        }
    }
