package kotlinCode.hierarchy.transport

class Bicycle(name: String): Transport(name) {
    override fun move() = println("Велосипед едет")
}