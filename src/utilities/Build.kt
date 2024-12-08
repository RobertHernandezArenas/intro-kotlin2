package utilities

class Build {

     fun  createStringArray(input: String, delimiter: String = ","): Array<String> {
        return input.split(delimiter).map { it.trim() }.toTypedArray()
    }

     fun  createIntArray(input: String, delimiter: String = ","): Array<Int> {
        return input.split(delimiter).map { it.trim().toInt() }.toTypedArray()

    }
}