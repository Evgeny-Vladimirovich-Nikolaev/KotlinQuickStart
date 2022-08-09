package kotlinCode.hierarchy.employees

class Seller(name: String, patronymic: String, lastName: String, age: Int): Employee(name = "", patronymic = "", lastName = "", age = 0), Cleaner {

    override fun work() = println("Продаю товары")
    override fun clean() = println("Убираю помещение")

}