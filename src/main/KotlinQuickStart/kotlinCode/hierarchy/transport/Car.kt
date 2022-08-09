package kotlinCode.hierarchy.transport

import kotlin.random.Random

class Car(override var name: String = "Машина"): Transport(name)  {
    override fun move() = println("Машина едет")
    fun startEngine(): Boolean = Random.nextBoolean()
}