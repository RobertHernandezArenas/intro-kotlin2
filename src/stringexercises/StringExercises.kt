package stringexercises

import java.util.*

class StringExercises {

    // Method for creating and launching an exercise
    fun start() {

        // Get user input from prompt terminal
        val scanner = Scanner(System.`in`)

        // Print menu
        println("Select a string exercise (1-6):")
        println("1. Concat 2 strings")
        println("2. Replace char in string")
        println("3. Remove char Start and End from string")
        println("4. Duplicate 2 main chars from string")
        println("5. Two main chars are the same from last?")
        println("6. Compare 2 strings are the same")

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
                println("[Char remove Output] ======> ${removeCharStartEnd(phrase, charToRemove)}")
            }
            
            // Exercise 4
            4 -> {
                println("You have selected option number 4")

                // Get text
                println("Please, Insert text:")
                val phrase: String = readlnOrNull().toString()

                // Remove char result
                println("[Char duplicate Output] ======> ${duplicate2MainChars(phrase)}")
            }

            5 -> {
                println("You have selected option number 5")

                // Get text
                println("Please, Insert text:")
                val phrase: String = readlnOrNull().toString()

                // Remove char result
                println("[Char duplicate Output] ======> ${twoMainCharsAreTheSameFromnLast(phrase)}")
            }

            // Exercise 6
            6 -> {
                println("You have selected option number 6")

                // Get text
                println("Please, Insert text:")
                val text1: String = readlnOrNull().toString()

                println("Please, Insert text:")
                val text2: String = readlnOrNull().toString()

                // Remove char result
                println("[Char duplicate Output] ======> ${verify2TextsAreTheSame(text1, text2)}")
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
    private fun removeCharStartEnd(phrase: String, character: Char): String {
        // TODO: try to do it with regex or toMutableList()
        
        // Verify if phrase is empty
        if (phrase.isEmpty()) return phrase

        // Char removed from start
        val phraseWithCharRemovedFromStart = if (phrase.first() == character) phrase.drop(1) else phrase

        // Char removed from last
        val phraseWithCharRemovedFromLast =
            if (phraseWithCharRemovedFromStart.last() == character) phraseWithCharRemovedFromStart.dropLast(1) else phraseWithCharRemovedFromStart

        // If char is not in phrase return phrase with no changes
        return phraseWithCharRemovedFromLast
    }

     // Exercise 4
    private fun duplicate2MainChars(phrase: String): String {
        // Two first main chars
        val twoFirstChars = phrase.substring(0, 2)

        // Two first main chars duplicated
        return "$twoFirstChars$twoFirstChars"
    }

    // Exercise 5
    private fun twoMainCharsAreTheSameFromnLast(phrase: String): Boolean {
        // Two first main chars
         val twoFirstChars = phrase.substring(0, 2)

        // Two last chars
        val twoLastChars = phrase.dropLast(2)

        // Check if two main chars are the same
        return twoFirstChars == twoLastChars
    }

    // Exercise 6
    private fun verify2TextsAreTheSame(text1: String, text2: String): Boolean = text1.lowercase() == text2.lowercase()
}