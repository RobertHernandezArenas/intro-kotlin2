package stringexercises

import java.util.*

class StringExercises {

    // Method for creating and launching an exercise
    fun start() {

        // Get user input from prompt terminal
        val scanner = Scanner(System.`in`)

        println("Select a string exercise (1-6):")
        println("1. Concat 2 strings")
        println("2. Replace char in string")
        println("3. Remove char Start and End from string")

        val input = scanner.nextInt()

        when (input) {

            // Exercise 1
            1 -> {
                println("You have selected option number 1")

                // Get first string
                println("Please, Insert the first string:")
                val firstString: String = readlnOrNull().toString()

                // Get second string
                println("Please, Insert the second string:")
                val secondString: String = readlnOrNull().toString()

                // Concat string result
                println("[String concat Output] ======> ${concatStrings(firstString, secondString)}")
            }

            // Exercise 2
            2 -> {
                println("You have selected option number 2")

                // Get text
                println("Please, Insert text:")
                val phrase: String = readlnOrNull().toString()

                // Get char to search in previous text
                println("Please, Insert character to search:")
                val charToSearch: String = readlnOrNull().toString()

                // Convert charToSearch: String to Char
                val hasChar = phrase.contains(charToSearch.single())

                // Check if charToSearch is in phrase
                if (!hasChar) {
                    println("The character you have selected does not exist in the phrase")

                    // TODO: Repeat action to insert char to search

                    // Throw exception error if charToSearch is not in phrase
                    throw Exception("The character you have selected does not exist in the phrase")
                }

                // Get char to replace
                println("Please, Insert a character to replace:")

                // Convert charToReplace: String to Char
                val charToReplace = scanner.next().single()

                // Replace char result
                println(
                    "[Char replace Output] ======> ${
                        replaceChar(
                            phrase,
                            charToSearch.single(),
                            charToReplace
                        )
                    }"
                )
            }

            // Exercise 3
            3 -> {
                println("You have selected option number 3")

                // Get text
                println("Please, Insert text:")
                val phrase: String = readlnOrNull().toString()

                // Get char to remove
                println("Please, Insert a character to remove:")

                // Convert charToRemove: String to Char
                val charToRemove = scanner.next().single()

                // Remove char result
                println("[Char remove Output] ======> ${removecharStartEnd(phrase, charToRemove)}")
            }

            // Default if user does not select an exercise or the exercise does not exist
            else -> println("The exercise you have selected does not exist")
        }
    }

    // Methods class

    // Exercise 1
    private fun concatStrings(input1: String, input2: String): String {
        return "$input1 $input2"
    }

    // Exercise 2
    private fun replaceChar(phrase: String, charToSearch: Char, charToReplace: Char): String {
        return phrase.replace(Regex(charToSearch.toString()), charToReplace.toString())
    }

    // Exercise 3
    // TODO: try to do with regex or toMutableList()
    private fun removecharStartEnd(phrase: String, character: Char): String {
    // Verify if phrase is empty
    if (phrase.isEmpty()) return phrase

    // Char removed from start
    val phraseWithCharRemovedFromStart = if (phrase.first() == character) phrase.drop(1) else phrase

    // Char removed from last
    val phraseWithCharRemovedFromLast = if (phraseWithCharRemovedFromStart.last() == character) phraseWithCharRemovedFromStart.dropLast(1) else phraseWithCharRemovedFromStart

    // If char is not in phrase return phrase with no changes
    return phraseWithCharRemovedFromLast
}
}