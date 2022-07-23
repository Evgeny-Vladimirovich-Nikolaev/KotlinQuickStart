package kotlinCode.collections

fun main() {
    val names: List<String> = listOf("",
        "Борис",
        "Евгений",
        "Анна",
        "Мария",
        "Андрей",
        "Святослав",
        "Абрам",
        "Adam",
        "Антон",
        "Иван",
        "Елена")
    val cyrillicNamesOnA: List<String> = names.filter { it.startsWith('А', true) }
    println(cyrillicNamesOnA)
}