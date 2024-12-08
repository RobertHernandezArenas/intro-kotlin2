package arrayexercises

import utilities.Build
import java.util.*

val build = Build()

class ArrayExercise {

    fun start() {

        // Get user input from prompt terminal
        val scanner = Scanner(System.`in`)

        // Print menu
        println("Select an Array exercise (1-6):")
        println("1. Push number by index into Array")
        println("2. Find number into Array")
        println("3. Count how many times the number is repeated into Array")
        println("4. Order array DESC")
        println("5. Push string into array")
        println("6. Return the first missing number within the range given an array")

        val input = scanner.nextInt()

        when (input) {

            // Exercise 1
            1 -> {
                println("You have selected option number 1")

                // Get first string
                val items = getInputTerminal("Please, type your items separated by commas:") ?: ""

                // Get second string
                val indexSelectedToPushItems =
                    getInputTerminal("Please, type the index where you want to add the item:") ?: ""

                // Get third string
                println("Please, type the item you want to add:")
                val itemToPush: String = readlnOrNull() ?: ""

                // Concat string result
                println(
                    "[Output] : ${
                        pushNumbToArrayByIndex(
                            build.createIntArray(items),
                            indexSelectedToPushItems.toInt(),
                            itemToPush.toInt()
                        )
                    }"
                )
            }

            // Exercise 2
            2 -> {
                // Get array
                val numbers = getInputTerminal("Please, type numbers separated by commas:") ?: ""

                // Number to Find in array
                val numberToFind = getInputTerminal("now, select the number to search for in array:")?.toInt()

                // Result
                println(
                    "[Output] : ${
                        findNumberInArray(build.createIntArray(numbers), numberToFind)
                    }"
                )
            }

            // Exercise 3
            3 -> {
                // Get array
                val numbers = getInputTerminal("Please, type numbers separated by commas:") ?: ""

                // Number to Find in array
                val numberToFind = getInputTerminal("now, select the number to search for in array:")?.toInt()

                // Result
                println(
                    "[Output] : The number is repeated ${
                        countRepeatedNumbers(build.createIntArray(numbers), numberToFind)
                    } times"
                )
            }

            // Exercise 4
            4 -> {
                // Get array
                val numbers = getInputTerminal("Please, type numbers separated by commas:") ?: ""

                // Result
                println(
                    "[Output] : Array ordered: ${
                        orderDescArray(build.createIntArray(numbers)).contentToString()
                    } "
                )

            }

            // Exercise 5
            5 -> {
                // Get array
                val texts = getInputTerminal("Please, type numbers separated by commas:") ?: ""

                // Number to Find in array
                val textToPush = getInputTerminal("now, select the number to search for in array:") ?: ""

                // Result
                println(
                    "[Output] : ${
                        pushStringIntoArray(build.createStringArray(texts), textToPush)
                    }"
                )


            }

            6 -> {
                // Get array
                val arrayNumbers = getInputTerminal("Please, type numbers separated by commas:") ?: ""

                // Range number begin
                val rangeNumberStart = getInputTerminal("now, select the range number to start")?.toInt() ?: 1

                // Range number finish
                val rangeNumberEnd = getInputTerminal("now, select the range number to end")?.toInt() ?: 1000000

                // Result
                println(
                    "[Output] : ${
                        returnFirstNumberNotExistsInRange(
                            build.createIntArray(arrayNumbers),
                            rangeNumberStart,
                            rangeNumberEnd
                        )
                    }"
                )

            }

            // Default if user does not select an exercise or the exercise does not exist
            else -> println("The exercise you have selected does not exist")
        }
    }

    companion object {

        // Utils
        fun getInputTerminal(message: String): String? {
            println(message)
            return readlnOrNull()
        }
    }

    // Exercise 1
    private fun pushNumbToArrayByIndex(array: Array<Int>, index: Int, item: Int): Array<Int> {
        // Verify array not be empty
        if (array.isEmpty()) throw Exception("Array is empty")

        // Verify the index exists
        if (index < 0 || index > array.size) throw Exception("Index not exists")

        // Print content array to string
        println(array.toMutableList().apply { add(index, item) }.toTypedArray().contentToString())

        // return th result
        return array.toMutableList().apply { add(index, item) }.toTypedArray()
    }

    // Exercise 2
    private fun findNumberInArray(array: Array<Int>, number: Int?): Boolean {
        return array.contains(number)
    }

    // Exercise 3
    private fun countRepeatedNumbers(array: Array<Int>, num: Int?): Int {
        return array.count { it == num }
    }

    // Exercise 4
    private fun orderDescArray(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            for (j in i..<array.size) {
                if (array[i] < array[j]) {
                    val temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
        }

        return array
    }

    // Exercise 5
    private fun pushStringIntoArray(array: Array<String>, text: String?): Array<String?> {
        val newArr = array.copyOf(array.size + 1)
        newArr[array.size] = text
        return newArr
    }

    // Exercise 6
    private fun returnFirstNumberNotExistsInRange(
        array: Array<Int>,
        rangeStart: Int,
        rangeEnd: Int
    ): Int {
        for (index in rangeStart..rangeEnd) {
            // Verify if number not exist into the array using .contains() an return it
            if (!array.contains(index)) {
                return index
            }
        }

        // return the following number from rangeEnd
        return rangeEnd + 1
    }
}