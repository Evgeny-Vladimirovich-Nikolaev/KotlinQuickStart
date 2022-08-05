package kotlinCode.OOP

fun main() {
    val rostov = AddressMyData("Ростов-на-Дону", "пр. Буденновский", "23")
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

class AddressMyData(val city: String, val street: String, val house: String) {

    fun copy(city: String = this.city, street: String = this.street, house: String = this.house): AddressMyData {
        return AddressMyData(city, street, house)
    }

    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = house

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AddressMyData

        if (city != other.city) return false
        if (street != other.street) return false
        if (house != other.house) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + house.hashCode()
        return result
    }

    override fun toString(): String {
        return "AddressMyData(city='$city', street='$street', house='$house')"
    }

}