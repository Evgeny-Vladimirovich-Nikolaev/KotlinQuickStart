package kotlinCode.functions

fun main() {
    println(findRectangularParallelepipedVolume())
    println(findRectangularParallelepipedVolume(5))
    println(findRectangularParallelepipedVolume(5, 4))
    println(findRectangularParallelepipedVolume(5, 4, 3))
    println(findRectangularParallelepipedVolume(width = 2))
    println(findRectangularParallelepipedVolume(height = 3, depth = 4, width = 5))
}

fun findRectangularParallelepipedVolume(width: Int = 1, depth: Int = width, height: Int = width) = width * depth * height

