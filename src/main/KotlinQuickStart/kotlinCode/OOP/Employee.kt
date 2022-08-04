package kotlinCode.OOP

import java.util.Calendar

fun main() {
   val employee = Employee("Козьма", "Кузьмич", "Прутков", 2000, "философ")
    employee.work()
    println(employee.workExperience)
    employee.printInfo()
    employee.acceptanceYear = 2010
    println(employee.workExperience)
    employee.printInfo()
}

fun Employee.printInfo() {
    println("Фамилия: ${lastName }\nИмя: ${name}\nОтчество: ${patronymic}\nДолжность: ${post}\nСтаж: $workExperience")
}

class Employee(
    val name: String,
    val patronymic: String,
    val lastName: String,
    var acceptanceYear: Int,
    val post: String
) {
    val workExperience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - acceptanceYear
    fun work() = println("Работаю")
}