package kotlinCode.functions

val fullNames = mutableListOf<String>()

fun main() {
    fillfullNames()
    val separatedList = fullNames.map { Pair(it.substringAfter(' ').substringBefore(' '), it.substringBefore(' '))}
    println(fullNames)
    println(separatedList)
}

fun fillfullNames() {
    fullNames.add("Иванов Георгий Иванович")
    fullNames.add("Власов Савва Никитич")
    fullNames.add("Беляков Артём Фёдорович")
    fullNames.add("Левина Анастасия Степановна")
    fullNames.add("Кулешов Иван Артёмович")
    fullNames.add("Родионов Андрей Никитич")
    fullNames.add("Романов Артемий Ильич")
    fullNames.add("Смирнов Андрей Андреевич")
    fullNames.add("Лебедева Алиса Кирилловна")
    fullNames.add("Коровина Мария Георгиевна")
}