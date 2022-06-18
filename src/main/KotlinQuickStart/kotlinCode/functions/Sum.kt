package kotlinCode.functions

fun main() {
    println(sum(1, 2, 3, 4, 5))
    println(sum(-1, -2, -3, -4, -5))
    println(sum(1, 1, 1))
}

fun sum(vararg numbers : Int) : Int
{
    var res : Int = 0
    for(num : Int in numbers) res += num
    return res
}