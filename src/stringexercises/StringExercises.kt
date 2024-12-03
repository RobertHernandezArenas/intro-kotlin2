package stringexercises

import java.util.*

class StringExercises {

    // Method for creating and launching an exercise
    fun create() {
        val scanner = Scanner(System.`in`)

        println("Select a string exercise (1-6):")
        println("1. String concat")

        val input = scanner.nextInt()

        when (input) {
           1 -> {
                println("You have selected option number 1")

                // Get first string
                println("Please, Insert the first string:")
                val firstString : String = readlnOrNull().toString()

                // Get second string
                println("Please, Insert the second string:")
                val secondString : String = readlnOrNull().toString()

                // Concat string result
                println("[String concat Output] ======> ${concatStrings(firstString, secondString)}")
            }

            else -> println("The exercise you have selected does not exist")
        }
    }

    private fun concatStrings(input1: String, input2: String): String {
        return "$input1 $input2"
    }
}