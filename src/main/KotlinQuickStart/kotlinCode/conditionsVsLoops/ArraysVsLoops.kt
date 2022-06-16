package kotlinCode.conditionsVsLoops

    fun main() {
        val array = arrayOfNulls<Int?>(101)
        for (i in 0..100) {
            array[i] = i
        }
        for (i in 0..100) {
            println(array[i])
        }
    }
