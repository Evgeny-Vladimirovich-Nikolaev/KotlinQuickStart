package kotlinCode.OOP

fun main() {
    val classCopy1 = ClassCopy("A", "B", "C")
    val classCopy2 = classCopy1.copy()
    val classCopy3 = classCopy1.copy(field3 = "D")
    val classCopy4 = classCopy1.copy(field1 = "E", field2 = "F", field3 = "G")
    println(classCopy1)
    println(classCopy2)
    println(classCopy3)
    println(classCopy4)
}

class ClassCopy(val field1: String, val field2: String, val field3: String) {
    fun copy(field1: String = this.field1, field2: String = this.field2, field3: String = this.field3): ClassCopy{
        return ClassCopy(field1, field2, field3)
    }

    override fun toString(): String {
        return "ClassCopy(field1='$field1', field2='$field2', field3='$field3')"
    }
}