package kotlinCode.functions

fun main() {
    println(trim("Longest", 5))
    println(trim("Big", 5))
    println(trim("Big", 2))
 }
fun trim(line : String, size : Int) = line.substring(0, line.length.coerceAtMost(size))
