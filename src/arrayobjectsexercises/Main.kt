package arrayobjectsexercises

import arrayexercises.ArrayExercise
import arrayexercises.ArrayExercise.Companion.getInputTerminal
import classes.classroom.ClassRoom
import classes.students.Student
import java.util.*


val studentsA = arrayOf(
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

val studentsB = arrayOf(
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

val classroomA = ClassRoom(
    "Classroom A", studentsA
)

val classroomB = ClassRoom(
    "Classroom B", studentsB
)


fun main() {
    // Exercise 1
    val classRoomWithStudents: Array<ClassRoom> = arrayOf(classroomA, classroomB)

    // Exercise 2
    for (classroom in classRoomWithStudents) {
        val studentsWithA = classroom.students.filter { it.name.lowercase().contains("a") }.map { it.name }
        println(studentsWithA.toTypedArray().contentToString())
    }
}