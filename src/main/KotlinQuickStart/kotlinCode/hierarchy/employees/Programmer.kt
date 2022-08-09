package kotlinCode.hierarchy.employees

class Programmer(name: String, patronymic: String, lastName: String, age: Int, var programmingLanguage: String): Employee(name = "", patronymic = "", lastName = "", age = 0), Cleaner {

    override fun work() = println("Пишу код на языке $programmingLanguage")
    override fun clean() = println("Навожу порядок на столе")

}