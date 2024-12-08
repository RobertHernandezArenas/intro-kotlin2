import arrayexercises.ArrayExercise
import doubles.myDouble
import exercises.Exercises
import floats.myFloat
import integers.myInteger
import longs.myLong
import stringexercises.StringExercises
import java.util.*

fun main() {

    // Get user input from prompt terminal
    val scanner = Scanner(System.`in`)

    // Print menu
    println("Select an Array exercise (1-6):")
    println("1. INT EXERCISES ")
    println("2. STRING EXERCISES")
    println("3. ARRAY EXERCISES")
    println("4. ARRAY OBJECTS")

    val input = scanner.nextInt()

    when (input) {

        1 -> {
            val exercise = Exercises()
            exercise.start()
        }

        2 -> {
            val exercise = StringExercises()
            exercise.start()
        }

        3 -> {
            val arrayExercise = ArrayExercise()
            arrayExercise.start()
        }

        else -> println("No exercises selected")
    }
}