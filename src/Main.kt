import integers.myInteger
import longs.myLong

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun main() {
        /*** Data Types ***/
        // Integers
        myInteger(23)
        myLong(100000000000L)

        //Flotantes
        val float: Float = 3.14f
        val double: Double = 3.1415926500054343

        //Booleanos
        var isFavorite: Boolean = true
        println("isFavorite: " + isFavorite)
        isFavorite = false

        // Caracteres (Char)
        val characterr: Char = 'k'

        // Cadenas (Los famosos Strings)
        val regards: String = "Hola mundo"

        // 2. Bucles
        // For(y sus derivados), While, DoWhile
        for (i in 0..5 step 2) {
            println("Value for i: " + i)
        }

        var valueA = 3
        val valueB = 5
        while (valueA < valueB) {
            valueA++
            valueA.inc()
            valueA = valueA + 1
            valueA += 1
            println("Hola soy pepe.")
        }

        do {
            valueA++
        } while (valueA < valueB)

        // 3. When (Cases) <- Switch
        var day = 5
        when (day) {
            1 -> println("Hoy es Lunes")
            2 -> println("Hoy es Martes")
            3 -> println("Hoy es Miercoles")
            4 -> println("Hoy es jueves")
            5 -> println("Hoy es VIIIIIIERNES!!!!!")
            6 -> println("Hoy es sabado de fiesta!!!!!")
            7 -> println("Hoy es Domingo de mimir...")
            else -> {
                println("No has ingresado un día válido")
            }
        }
    }
}