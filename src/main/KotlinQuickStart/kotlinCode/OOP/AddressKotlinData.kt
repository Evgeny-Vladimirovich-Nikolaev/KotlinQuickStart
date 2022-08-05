package kotlinCode.OOP

fun main() {
    val rostov = AddressKotlinData("Ростов-на-Дону", "пр. Буденновский", "23")
    val rostovOnDon = rostov.copy()
    println(rostov)
    println(rostovOnDon)
    println(rostov.hashCode())
    println(rostovOnDon.hashCode())
    println(rostov === rostovOnDon)
    println(rostov == rostovOnDon)

    val (rostovCity: String, rostovStreet: String, rostovHouse: String) = rostov
    println(rostovCity)
    println(rostovStreet)
    println(rostovHouse)
}

data class AddressKotlinData(val city: String, val street: String, val house: String)