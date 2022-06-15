import kotlin.random.Random

/**
 * 1. Цикл for записывается for(i in 1..10) - крайние значения входят в перебор
 */

fun main(args: Array<String>) {
    val rnd: Random = Random(0)
    for (i in 0..23) {
        val time: Int = rnd.nextInt(23)
        val whether: String = if (rnd.nextBoolean()) "fine" else "bad"
        when {
            time in 6..22 && whether == "fine" -> {
                println("Time is $time and the whether is $whether - walk")
            }
            time in 6..22 && whether == "bad" -> {
                println("Time is $time and the whether is $whether - reed book")
            }
            else -> println("Time is $time - sleep")
        }
    }
}
