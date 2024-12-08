package arrayobjectsexercises

import arrayexercises.ArrayExercise.Companion.getInputTerminal
import java.util.*

class ArrayObjectsExercise {
    fun start() {

        // Get user input from prompt terminal
        val scanner = Scanner(System.`in`)

        // Print menu
        println("Select an Array exercise (1-6):")
        println("1. Create an Array with 10 students into 2 classes each one them")


        val input = scanner.nextInt()

        when (input) {

            // Exercise 1
            1 -> {


            }

            // Default if user does not select an exercise or the exercise does not exist
            else -> println("The exercise you have selected does not exist")
        }
    }
}