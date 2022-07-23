package kotlinCode.functions

var numbers = arrayOfNulls<String?>(1000)
var names = arrayOfNulls<String?>(1000)

fun main() {
    fillNumbers()
    fillUsers()
    val users = names.zip(numbers)
    for(number in numbers) println(number)
    for(name in names) println(name)
    for(user in users) println(user)
}

fun fillNumbers() {
    for(hundreds in 0..9) {
        for(j in 0..99) {
            val units: String = if (j< 10) {
                "0$j"
            } else {
                "$j"
            }
            numbers[hundreds * 100 + j] = "+7-911-0000-0$hundreds-$units"
        }
    }
}

fun fillUsers() {
    val tempNames = arrayOf<String>(
        "Алёна",
        "Борис",
        "Галина",
        "Дмитрий",
        "Елена",
        "Евгений",
        "Жанна",
        "Иван",
        "Клара",
        "Лев",
        "Мария",
        "Станислав",
        "Фёкла",
        "Харитон",
        "Юлия",
        "Ярослав"
    )
    for (i in 0..999) {
        names[i] = tempNames[(Math.random() * 16).toInt()]
    }
}