package kotlinCode.hierarchy.waterCarrier

class Sportsman(name: String) {

    fun callWaterCarrier(waterCarrier: WaterCarrier) {
        println("Принеси мне воды!")
        waterCarrier.bringWater()
    }

    inline fun callWaterCarrier(bringWater: () -> Unit) {
        bringWater()
    }

}