
class Kotlin {
      fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main() {

    val kotlinInstance = Kotlin()

    val sum = { x: Int, y: Int -> x + y }
    val multiply = { x: Int, y: Int -> x * y }

    val result1 = kotlinInstance.applyOperation(3, 5, sum)
    println("Sum: $result1")

    val result2 = kotlinInstance.applyOperation(3, 5, multiply)
    println("Product: $result2")
}
