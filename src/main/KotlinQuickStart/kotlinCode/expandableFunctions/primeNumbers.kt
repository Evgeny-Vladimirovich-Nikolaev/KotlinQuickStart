package kotlinCode.expandableFunctions

fun main() {
    for(number in 0..1000) {
        if (number.isPrime()) {
            println("Число $number является простым")
        } else {
            println("Число $number не является простым")
        }
    }
}

fun Int.isPrime(): Boolean {
    if(this < 2) return false
    if(this in 2..3) return true
    var divider = 2
    while (divider * divider <= this) {
        if(this % divider++ == 0) return false
    }
    return true
}