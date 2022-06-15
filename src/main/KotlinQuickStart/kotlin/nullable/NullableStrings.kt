package kotlin.nullable

/**
 * 1. По умолчанию все объекты в Котлин - не нулабельные: не могут содержать
 * значение null.
 * 2. Чтобы сделать объект нулабельным, нужно добавить знаки ? после объявления
 * типа переменной.
 * 3. Вызвать метод нулабельного типа можно двумя способами:
 *      а) безопасный способ - varName?.methodName()
 *      б) небезопасный способ (!!ПЛОХАЯ ПРАКТИКА) - varName!!.methodName()
 * 4. Чтобы использовать вместо null значение, по умолчанию используется
 * оператор Элвиса - varName?:defaultValue.
 */

fun main(args: Array<String>) {

    //Null can not be a value of a non-null type String
    //var zero : String = null;

    //а вот так можно присвоить значение null
    var zero: String? = null;

    var first: String? = null;
    var second: String? = "four";
    var third: String? = null;
    val result: Int = first?.length ?: 0 + (second?.length ?: 0) + (third?.length ?: 0)
    println(result)

    //барабанная дробь...
    println(first!!.length);
    //java.lang(!)NullPointerException
}
