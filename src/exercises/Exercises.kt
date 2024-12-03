class Exercises {

    // Method for creating and launching an exercise
    fun create() {

        println("Select an exercise number (1-8):")
        val input = readlnOrNull()?.toIntOrNull()

        when (input) {
            1 -> {
                println("Insert two numbers to add:")
                val (a, b) = getTwoNumbers()
                println("Result: ${add(a, b)}")
            }

            2 -> {
                println("Insert two numbers to multiply:")
                val (a, b) = getTwoNumbers()
                println("Result: ${multiply(a, b)}")
            }

            3 -> {
                println("Insert two numbers (dividend and divider):")
                val (dividend, divider) = getTwoNumbers()
                println("Result: ${divide(dividend, divider)}")
            }

            4 -> {
                println("Insert two numbers (dividend and divider):")
                val (dividend, divider) = getTwoNumbers()
                println("Result: ${divideIntegerPart(dividend, divider)}")
            }

            5 -> {
                println("Insert the number of matches played and won:")
                val (playedMatches, wonMatches) = getTwoNumbers()
                println("Winning matches percentage: ${calculatePercentageVictories(playedMatches, wonMatches)}%")
            }

            6 -> {
                println("Insert two numbers to determine the highest:")
                val (a, b) = getTwoNumbers()
                println("The highest number is: ${getHighestNumber(a, b)}")
            }

            7 -> {
                println("Insert width, length and height of the pool:")
                val (width, length, height) = getThreeNumbers()
                println("Pool volume is: ${calculateVol(width, length, height)}")
            }

            8 -> {
                println("Insert quantity of first odds numbers to be calculated:")
                val quantity = readlnOrNull()?.toIntOrNull() ?: 0
                println("First $quantity odd numbers: ${calculateOdds(quantity)}")
            }

            else -> println("The exercise you have selected does not exist")
        }
    }

    // Methods class
    private fun getTwoNumbers(): Pair<Int, Int> {
        val a = readlnOrNull()?.toIntOrNull() ?: 0
        val b = readlnOrNull()?.toIntOrNull() ?: 0
        return Pair(a, b)
    }

    private fun getThreeNumbers(): Triple<Int, Int, Int> {
        val a = readlnOrNull()?.toIntOrNull() ?: 0
        val b = readlnOrNull()?.toIntOrNull() ?: 0
        val c = readlnOrNull()?.toIntOrNull() ?: 0
        return Triple(a, b, c)
    }

    // Exercise 1
    private fun add(a: Int, b: Int): Int = a + b

    // Exercise 2
    private fun multiply(a: Int, b: Int): Int = a * b

    // Exercise 3
    private fun divide(dividend: Int, divider: Int): Double? =
        if (divider == 0) null else dividend.toDouble() / divider

    // Exercise 4
    private fun divideIntegerPart(dividend: Int, divider: Int): Int? =
        if (divider == 0) null else dividend / divider

    // Exercise 5
    private fun calculatePercentageVictories(playedMatches: Int, wonMatches: Int): Double =
        if (playedMatches == 0) 0.0 else (wonMatches.toDouble() / playedMatches) * 100

    // Exercise 6
    private fun getHighestNumber(a: Int, b: Int): Int = if (a > b) a else b

    // Exercise 7
    private fun calculateVol(width: Int, length: Int, height: Int): Int = width * length * height

    // Exercise 8
    private fun calculateOdds(quantity: Int): List<Int> {
        if (quantity <= 0) return emptyList()
        val odds = mutableListOf(2)
        var num = 3
        while (odds.size < quantity) {
            if (odds.none { num % it == 0 }) odds.add(num)
            num += 2
        }
        return odds
    }
}