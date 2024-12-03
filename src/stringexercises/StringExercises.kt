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
                println("Please, Insert two strings to concat:")
                val (input1, input2) = getTwoStrings()
                println(input1)
                println(input2)
                println("Result: ${concatStrings(input1, input2)}")
            }


            else -> println("The exercise you have selected does not exist")
        }
    }

    private fun concatStrings(input1: String, input2: String): String {
        return "$input1 $input2"
    }

    // Methods class
    private fun getTwoStrings(): Pair<String, String> {
        val a = readlnOrNull().toString()
        val b = readlnOrNull().toString()
        return Pair(a, b)
    }

}