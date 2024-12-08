package arrayobjectsexercises

import classes.classroom.ClassRoom
import classes.students.Student

/**
 * Exercise day 4 ARRAY AND OBJECTS
 *
 * This file content 6 exercise to put in practice all about array and objects in Kotlin
 *
 * @author Robert Hernández Arenas
 * @version 1.0
 * @since 2024-12-05
 */


val studentsA = arrayOf(
    Student("Juan", "Pérez", 20, true, false),
    Student("María", "González", 21, false, true),
    Student("Pedro", "Martínez", 22, false, true),
    Student("Lucía", "Hernández", 23, false, false),
    Student("Carlos", "Sánchez", 24, true, true),
    Student("Ana", "García", 25, true, true),
    Student("David", "López", 26, false, false),
    Student("Sofía", "Ramos", 27, false, true),
    Student("Miguel", "Díaz", 28, true, false),
    Student("Eva", "Fernández", 29, true, true)
)

val studentsB = arrayOf(
    Student("Jorge", "Gómez", 20, false, false),
    Student("Laura", "Rodríguez", 21, true, true),
    Student("Raúl", "Yanez", 22, true, true),
    Student("Isabel", "Sánchez", 23, false, false),
    Student("Tomás", "Rios", 24, false, true),
    Student("Cristina", "López", 25, false, true),
    Student("Alejandro", "Martínez", 26, true, false),
    Student("Beatriz", "González", 27, true, true),
    Student("Fernando", "Pérez", 28, false, false),
    Student("Sara", "Verdeal", 29, false, true)
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
        println("Students with a in their names :::> ${studentsWithA.toTypedArray().contentToString()}")
    }

    // Exercise 3
    for (classroom in classRoomWithStudents) {
        val studentsWithA = classroom.students.filter { !it.isApproved && !it.isProgressing }.map { it.name }
        println("Students failed and not progressing :::> ${studentsWithA.toTypedArray().contentToString()}")
    }
}