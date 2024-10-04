// Top-level declaration of a class
class Kotlin {

    // Higher-order function inside the class
    fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

// Top-level function (the main entry point of the program)
fun main() {
    // Create an instance of the Kotlin class
    val kotlinInstance = Kotlin()

    // Define lambdas for sum and multiply operations
    val sum = { x: Int, y: Int -> x + y }
    val multiply = { x: Int, y: Int -> x * y }

    // Apply operations using the applyOperation function
    val result1 = kotlinInstance.applyOperation(3, 5, sum)
    println("Sum: $result1")  // Output: Sum: 8

    val result2 = kotlinInstance.applyOperation(3, 5, multiply)
    println("Product: $result2")  // Output: Product: 15
}
