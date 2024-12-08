package arrayobjectsexercises

import arrayexercises.ArrayExercise.Companion.getInputTerminal
import classes.classroom.ClassRoom
import classes.students.Student
import java.util.*

class ArrayObjectsExercise {

    private val students1 = arrayOf(
        Student("Juan", "Pérez", 20),
        Student("María", "González", 21),
        Student("Pedro", "Martínez", 22),
        Student("Lucía", "Hernández", 23),
        Student("Carlos", "Sánchez", 24),
        Student("Ana", "García", 25),
        Student("David", "López", 26),
        Student("Sofía", "Ramos", 27),
        Student("Miguel", "Díaz", 28),
        Student("Eva", "Fernández", 29)
    )

    private val students2 = arrayOf(
        Student("Jorge", "Gómez", 20),
        Student("Laura", "Rodríguez", 21),
        Student("Raúl", "Yanez", 22),
        Student("Isabel", "Sánchez", 23),
        Student("Tomás", "Rios", 24),
        Student("Cristina", "López", 25),
        Student("Alejandro", "Martínez", 26),
        Student("Beatriz", "González", 27),
        Student("Fernando", "Pérez", 28),
        Student("Sara", "Verdeal", 29)
    )

    val classroom1 = ClassRoom(
        "Classroom 2", students2
    )

    val classroom2 = ClassRoom(
        "Classroom 2", students2
    )

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

                println(buildArrayWith2Classes10Students())
            }

            // Default if user does not select an exercise or the exercise does not exist
            else -> println("The exercise you have selected does not exist")
        }
    }

    // Exercise 1
    private fun buildArrayWith2Classes10Students(): Array<ClassRoom> {
        println(students1)
        return arrayOf(classroom1, classroom2)
    }
}

fun main () {

}