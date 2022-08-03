fun main() {
    val array = arrayOfNulls<Int?>(301);
    for(i in 0..300) {
        array[i] = i + 300
    }
    for(index in (300..0).withIndex()) {
        //if(array[index] % 5 == 0) println(array[index])
    }
}