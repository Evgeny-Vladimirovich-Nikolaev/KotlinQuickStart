package kotlinCode.OOP

import java.util.*

fun main() {
    val dog = Dog()
    dog.nickname = "tUzIcK"
    dog.age = 3
    dog.height = 18.0
    println(dog)
}

class Dog {

    var nickname: String = ""
    set(value) {
        field = value.lowercase().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
        }
    }
    var age: Int = 0
    set(value) {
        if(value >= 0) {
            field = value
        }
    }
    var height: Double = 0.0
    set(value) {
        if (value >= 0.0) {
            field = value
        }
    }

    override fun toString(): String {
        return "Dog(nickname=$nickname, age=$age, height=$height)"
    }

}