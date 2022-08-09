package kotlinCode.staticUsing

fun main() {
    println(MyRandom.randomInteger(1, 100))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDay())
}

class MyRandom {
    companion object{
        private val daysOfWeek = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
        fun randomInteger(min: Int, max: Int) =  (Math.random() * (max - min + 1)).toInt() + min
        fun randomBoolean() = randomInteger(0, 1) > 0
        fun randomDay() = daysOfWeek[randomInteger(0, 6)]
    }
}