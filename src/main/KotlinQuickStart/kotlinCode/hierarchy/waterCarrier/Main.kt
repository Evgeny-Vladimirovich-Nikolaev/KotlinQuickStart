package kotlinCode.hierarchy.waterCarrier

fun main() {
    val sportsman = Sportsman("Марафонец")
    sportsman.callWaterCarrier(object : WaterCarrier {
        override fun bringWater() = println("Несу воду")
    })
    sportsman.callWaterCarrier {
        println("Принеси мне воды")
    }
}