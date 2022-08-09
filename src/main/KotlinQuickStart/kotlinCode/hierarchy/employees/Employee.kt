package kotlinCode.hierarchy.employees

abstract class Employee(val name: String, val patronymic: String, val lastName: String, val age: Int) {
    abstract fun work()
}