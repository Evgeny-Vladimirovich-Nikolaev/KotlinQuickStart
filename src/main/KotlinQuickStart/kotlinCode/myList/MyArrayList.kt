package kotlinCode.myList

fun main() {
    var myList = MyArrayList()
    println(myList.size())
    println(myList.capacity())

    for (i in 5..17) {
        myList.add(i.toString())
        println("size = ${myList.size()}")
        println("capacity = ${myList.capacity()}")
    }

    for (index in 0 until myList.size()) {
        println(myList.get(index))
    }

    for (i in 4 downTo 0) {
        myList.set(i.toString(), 0)
        println("size = ${myList.size()}")
        println("capacity = ${myList.capacity()}")
    }

    for (index in 0 until myList.size()) {
        println(myList.get(index))

    }

    println("size = ${myList.size()}")
    println("capacity = ${myList.capacity()}")

    val myNewList = MyArrayList(arrayOf("раз", "два", "три", "четыре", "пять"))
    for (index in 0 until myNewList.size()) {
        println(myNewList.get(index))
    }
    println("size = ${myNewList.size()}")
    println("capacity = ${myNewList.capacity()}")

    myNewList.add("шесть")
    println("size = ${myNewList.size()}")
    println("capacity = ${myNewList.capacity()}")

}

class MyArrayList(capacity: Int = 10) : MyList {
    private var capacity: Int = capacity
    private var size: Int = 0
    private var array = arrayOfNulls<String?>(capacity)

    constructor(strings: Array<String>) : this(strings.size) {
        size = strings.size
        for (ind in strings.indices) {
            array[ind] = strings[ind]
        }
    }

    override fun get(index: Int): String {
        if (index < size && index > -1) {
            array[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: String) {
        if (size === capacity) {
            expandArray()
        }
        array[size++] = string
    }

    override fun remove(element: String) {
        for (index in 0 until size) {
            if (element == array[index]) {
                removeAt(index)
                return
            }
        }
        throw NoSuchElementException()
    }

    override fun removeAt(index: Int) {
        var ind = index
        while (ind < size - 1) {
            array[ind] = array[++ind]
        }
        size--
    }

    override fun size(): Int {
        return size
    }

    fun capacity(): Int {
        return capacity
    }

    fun set(element: String, index: Int) {
        var ind = size
        if (size === capacity) {
            expandArray()
        }
        while (ind > index) {
            array[ind] = array[--ind]
        }
        array[index] = element
        size++
    }

    private fun expandArray() {
        capacity = capacity * 3 / 2 + 1
        val nextArray = arrayOfNulls<String?>(capacity)
        for (index in 0 until size) {
            nextArray[index] = array[index]
        }
        array = nextArray
    }
}