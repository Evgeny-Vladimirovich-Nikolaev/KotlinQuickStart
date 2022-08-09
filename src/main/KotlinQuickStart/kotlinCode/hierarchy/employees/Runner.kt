package kotlinCode.hierarchy.employees

fun main() {
    val employees: List<Employee> = listOf(
        Director("Сергей", "Анатольевич", "Кудрин", 50),
        Seller("Андрей", "Казимирович", "Пудрин", 45),
        Programmer("Алексей", "Владимирович", "Дятлов", 60, "Fortran"),
        Seller("Олег", "Павлович", "Мудрин", 27),
        Programmer("Станислав", "Владиславович", "Орлов", 45, "С++"),
        Seller("Абрам", "Абрамович", "Абрамов", 36),
        Programmer("Вениамин", "Петрович", "Синицын", 36, "Java"),
        Programmer("Пётр", "Вениаминович", "Голубев", 36, "Java"),
        Seller("Егор", "Тимофеевич", "Антонов", 20),
        Programmer("Семён", "Семёнович", "Соловьёв", 34, "C#"),
        Seller("Артём", "Сергеевич", "Гольцев", 31),
        Programmer("Борис", "Аркадьевич", "Воробьев", 27, "Python"),
        Seller("Вадим", "Вячеславович", "Барыкин", 53),
        Programmer("Захар", "Маркович", "Кукушкин", 39, "Kotlin"),
    )
    for (employee in employees) {
        employee.work()
    }
    val cleaners: List<Cleaner> = employees.filter { it is Cleaner }.map { it as Cleaner}
    for (employee in cleaners) {
        employee.clean()
    }
    val languages: List<String> = employees.filterIsInstance<Programmer>(). map {it.programmingLanguage}. distinct()
    println(languages)
}