package kotlinCode.OOP

fun main() {
    val singleTon1 = MySingleTon.getInstance()
    singleTon1.addToList("1")
    singleTon1.addToList("2")
    val singleTon2 = MySingleTon.getInstance()
    singleTon1.addToList("3")
    singleTon1.addToList("4")
    singleTon1.print()
    singleTon2.print()
}

class MySingleTon private constructor() {
    private val list: MutableList<String> = mutableListOf()

    companion object {
        private var mySingleTon: MySingleTon? = null
        fun getInstance(): MySingleTon {
            mySingleTon?.let {
                return it
            }
            mySingleTon = MySingleTon()
            return mySingleTon as MySingleTon
        }
    }

    fun addToList(s: String) {
        this.list.add(s)
    }

    fun print() {
        for (s in list) {
            println(s)
        }
    }
}