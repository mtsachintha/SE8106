fun sumOfEvenNumbers() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    var sum = 0
    for (n in numbers) if (n % 2 == 0) sum += n
    println(sum)
}

fun findMaximum() {
    val numbers = listOf(10, 5, 25, 8, 15)
    var max = numbers[0]
    for (n in numbers) if (n > max) max = n
    println(max)
}

fun fizzBuzz() {
    for (i in 1..50) {
        if (i % 3 == 0 && i % 5 == 0) println("Fizzbuzz")
        else if (i % 3 == 0) println("Fizz")
        else if (i % 5 == 0) println("Buzz")
        else println(i)
    }
}

fun countVowels() {
    val text = "Hello Kotlin"
    var count = 0
    for (c in text.lowercase()) if (c in "aeiou") count++
    println(count)
}

fun removeDuplicates() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val newList = mutableListOf<Int>()
    for (n in numbers) if (!newList.contains(n)) newList.add(n)
    println(newList)
}

fun reverseList() {
    val items = listOf("A", "B", "C", "D")
    val reversed = mutableListOf<String>()
    for (i in items.size - 1 downTo 0) reversed.add(items[i])
    println(reversed)
}

fun factorial() {
    val num = 5
    var fact = 1
    for (i in 1..num) fact *= i
    println(fact)
}

fun sumOfPositiveNumbers() {
    val numbers = listOf(-2, 5, 3, -1, 4)
    var sum = 0
    for (n in numbers) if (n > 0) sum += n
    println(sum)
}

fun printPattern() {
    for (i in 1..5) {
        for (j in 1..i) print("*")
        println()
    }
}

fun main() {

    println("Sum of Even Numbers")
    sumOfEvenNumbers()
    println()

    println("Maximum in a List")
    findMaximum()
    println()

    println("FizzBuzz")
    fizzBuzz()
    println()

    println("Count Vowels")
    countVowels()
    println()

    println("Remove Duplicates")
    removeDuplicates()
    println()

    println("Reverse List")
    reverseList()
    println()

    println("Factorial")
    factorial()
    println()

    println("Sum of Positive Numbers")
    sumOfPositiveNumbers()
    println()

    println("Pattern")
    printPattern()
}