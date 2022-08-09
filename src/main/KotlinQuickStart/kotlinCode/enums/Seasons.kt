package kotlinCode.enums

enum class Seasons {
    SPRING, SUMMER, AUTUMN, WINTER;

    private val russianNames: Array<String> = arrayOf("Весна", "Лето", "Осень", "Зима")
    fun getRussianName() = russianNames[this.ordinal]
   }