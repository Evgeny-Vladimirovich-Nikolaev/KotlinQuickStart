package kotlinCode.OOP

class Cat(val nickname: String, val age: Int, val weight: Float = 0f) {
    fun isOld(): Boolean = age >12
}