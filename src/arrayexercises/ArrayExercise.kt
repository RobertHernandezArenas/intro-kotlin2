package arrayexercises

import java.util.*

class ArrayExercise {

    fun start() {

        // Get user input from prompt terminal
        val scanner = Scanner(System.`in`)

        // Print menu
        println("Select a string exercise (1-6):")
        println("1. Push number to Array")

        val input = scanner.nextInt()

        when (input) {

            // Exercise 1
            1 -> {
                println("You have selected option number 1")

                // Get first string
                println("Please, type your items separated by commas:")
                val firstString: String = readlnOrNull().toString()

                // Get second string
                println("Please, type the index where you want to add the item:")
                val secondString: String = readlnOrNull().toString()

                // Get third string
                println("Please, type the item you want to add:")
                val itemToAdd: String = readlnOrNull().toString()


                // Concat string result
                println(
                    "[Array Push Item Output] ======> ${
                        pushNumbToArrayByIndex(
                            stringToIntArray(firstString),
                            secondString.toInt(),
                            itemToAdd.toInt()
                        )
                    }"
                )
            }
            // Default if user does not select an exercise or the exercise does not exist
            else -> println("The exercise you have selected does not exist")
        }


    }

    //Utils 
    private fun stringToIntArray(input: String, delimiter: String = ","): Array<Int> {
        return input.split(delimiter) // Divide String
            .map { it.trim().toInt() } // Sanitize and convert to Int
            .toTypedArray() // Convert List to Array<Int>
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
}