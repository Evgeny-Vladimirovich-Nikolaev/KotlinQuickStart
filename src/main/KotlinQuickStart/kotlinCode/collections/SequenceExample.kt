package kotlinCode

fun main() {
    val employees = generateSequence("employee #1") {
        val index = it.substringAfter("employee #").toInt() + 1
        "employee #$index"
    }
    val listOf100 = employees.take(100)
    for (employee in listOf100) {
        println(employee)
    }
}