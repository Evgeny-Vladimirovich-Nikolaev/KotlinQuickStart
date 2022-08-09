package kotlinCode.hierarchy.employees

class Director(name: String, patronymic: String, lastName: String, age: Int): Employee(name = "", patronymic = "", lastName = "", age = 0) {

    override fun work() = println("Управляю процессом")

}