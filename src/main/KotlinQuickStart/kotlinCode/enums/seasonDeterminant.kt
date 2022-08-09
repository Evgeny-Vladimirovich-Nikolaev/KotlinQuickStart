package kotlinCode.enums

import kotlinCode.enums.Months.*
import kotlinCode.enums.Seasons.*

fun main() {
    println(determinateSeason(APRIL))
    println(determinateSeason(JANE))
    println(determinateSeason(OCTOBER))
    println(determinateSeason(DECEMBER))
    println(determinateRussianSeason(MAY))
    println(determinateRussianSeason(AUGUST))
    println(determinateRussianSeason(NOVEMBER))
    println(determinateRussianSeason(JANUARY))
}

fun determinateSeason(month: Months): Seasons {
    return when (month) {
        MARCH, APRIL, MAY -> SPRING
        JANE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
        DECEMBER, JANUARY, FEBRUARY -> WINTER
    }
}

fun determinateRussianSeason(month: Months): String {
    return when (month) {
        MARCH, APRIL, MAY -> SPRING.getRussianName()
        JANE, JULY, AUGUST -> SUMMER.getRussianName()
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN.getRussianName()
        DECEMBER, JANUARY, FEBRUARY -> WINTER.getRussianName()
    }
}

