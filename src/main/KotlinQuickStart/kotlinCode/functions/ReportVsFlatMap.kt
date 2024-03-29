package kotlinCode.functions

import java.util.*

val data = mapOf(
    "Январь" to listOf(100, 200, 150, 50, 120),
    "Февраль" to listOf(100, 200, 150, 250),
    "Март" to listOf(300, 200, 150, 50, 70),
    "Апрель" to listOf(100, 100, 150, 80),
    "Май" to listOf(90, 140, 150, 200),
    "Июнь" to listOf(200, 150, 160, -180),
    "Июль" to listOf(140, 190, 240, 220, 140),
    "Август" to listOf(120, 20, 30, 260),
    "Сентябрь" to listOf(300, 100, 110, 60),
    "Октябрь" to listOf(100, -200, 150, 50),
    "Ноябрь" to listOf(100, 120, 150, 400),
    "Декабрь" to listOf(100, 220, 300, 450, 650)
)

fun main() {
    printReport()
}

fun printReport() {
    println("Средняя выручка в неделю составляет ${calculateWeekAverageRevenue()} рублей.")
    println("Средняя выручка в месяц составляет ${calculateMonthAverageRevenue()} рублей.")

    var monthSum = calculateMonthMaxRevenue()
    println("Максимальная выручка в месяц составляет $monthSum рублей.")
    println("Была в следующих месяцах: ${findMonthByRevenue(monthSum)}.")

    monthSum = calculateMonthMinRevenue()
    println("Минимальная выручка в месяц составляет $monthSum рублей.")
    println("Была в следующих месяцах: ${findMonthByRevenue(monthSum)}.")

    println("Неправильные данные содержатся в следующих месяцах: ${findWrongData()}.")
}

fun calculateWeekAverageRevenue(): Double {
    return data.filterNot { it.value.any { it < 0 } }.flatMap { it.value }.average()
}

fun calculateMonthAverageRevenue(): Double {
    return data.filterNot { it.value.any { it < 0 } }.map { it.value.sum() }.average()
}

fun calculateMonthMaxRevenue(): Int {
    return data
        .filterNot { it.value.any { it < 0 } }
        .map { it.value.sum() }
        .stream()
        .max(Comparator.naturalOrder()).orElse(0)
}

fun calculateMonthMinRevenue(): Int {
    return data
        .filterNot { it.value.any { it < 0 } }
        .map { it.value.sum() }
        .stream()
        .min(Comparator.naturalOrder()).orElse(0)
}

fun findMonthByRevenue(monthSum: Int): String {
    return data
        .filter { it.value.sum() == monthSum }
        .map { it.key }
        .toString()
        .replace("[", "")
        .replace("]", "")
}

fun findWrongData(): String {
    return data
        .filter { it.value.any { it < 0} }
        .map { it.key }
        .toString()
        .replace("[", "")
        .replace("]", "")
}
