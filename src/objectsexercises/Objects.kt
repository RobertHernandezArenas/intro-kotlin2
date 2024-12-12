package objectsexercises

// Exercise 1
data class Brand(val name: String, val year: Int, val country: String)

// Exercise 2
data class Car(val model: String, val year: Int, val hp: Int, val brand: String)

class ObjectsExercise {

    // Exercise 1
    fun createBrand(name: String, year: Int, country: String): Brand = Brand(name, year, country)


    // Exercise 2
    fun createCar(model: String, year: Int, hp: Int, brand: String): Car = Car(model, year, hp, brand)

}


fun main() {

    // Exercise 1
    val newBrand = ObjectsExercise().createBrand("BMW", 1897, "Alemania").toString()
    println(newBrand)


    /*
    Ejercicio 2
Crea una función con los parámetros que necesites que cree y devuelva un objeto coche que tenga un nombre de modelo, fecha de fabricación, número de caballos y marca
    */

    val newCar = ObjectsExercise().createCar("BMW", 1897, 500, "Alemania").toString()
    println(newCar)
}