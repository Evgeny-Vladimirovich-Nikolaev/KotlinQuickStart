/**
 * 1. Конструкция when - аналог конструкции switch в java,
 * но с возможностью присваивания и обязательным else.
 * 2. else (аналог default) пишется внутри блока.
 * 3. Проверяемые значения могут быть написаны в одной строке,
 * если имеют одно значение на выходе, отделяются от значения
 * на выходе знаком "->".
 * 4. break в конструкции when не используется.
 */

fun main () {
    printSeason("January")
    printSeason("May")
    printSeason("September")
    printSeason("Studen")
    printSeason("")
}

fun printSeason(month : String) {
    println("$month is a month of ${defineSeason(month)}")
}

fun defineSeason(month: String): Any {
    val season : String = when(month){
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "Jane", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> "Not founded"
    }

    return season
}


