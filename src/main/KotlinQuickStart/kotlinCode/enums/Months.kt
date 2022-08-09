package kotlinCode.enums

enum class Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JANE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    private val russianNames: Array<String> = arrayOf(
        "Январь",
        "Февраль",
        "Март",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    )

    fun getRussianName() = russianNames[this.ordinal]
}
