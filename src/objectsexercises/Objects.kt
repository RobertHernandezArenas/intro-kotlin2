package objectsexercises

// Exercise 1
data class Brand(val name: String, val year: Int, val country: String)

class ObjectsExercise {

    // Exercise 1
    fun createBrand(name: String, year: Int, country: String): Brand = Brand(name, year, country)


}


fun main() {

    // Exercise 1
    val newBrand = ObjectsExercise().createBrand("BMW", 1897, "Alemania").toString()
    println(newBrand)


}