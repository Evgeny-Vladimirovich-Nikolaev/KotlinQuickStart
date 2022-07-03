package kotlinCode.exceptions

fun main() {
    println(sum("2", "4"))
    println(sum("2", "four"))
}

fun sum (a : String, b : String) : Int {
    return try {
        a.toInt() + b.toInt()
    } catch (e : java.lang.NumberFormatException) {
        println( ("Invalid Value"))
        0
    }
}