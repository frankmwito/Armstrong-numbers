

import java.util.*
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter any number:")
    val number = scanner.nextInt()
    val numLength = number.toString().length
    var sum = 0
    var tempNumber = number

    while (tempNumber > 0) {
        val digit = tempNumber % 10
        sum += digit.toDouble().pow(numLength).toInt()
        tempNumber /= 10
    }

    if (number == sum) {
        println("Number is an Armstrong number = $sum")
    } else {
        println("Number is not an Armstrong number = $sum")
    }
}
