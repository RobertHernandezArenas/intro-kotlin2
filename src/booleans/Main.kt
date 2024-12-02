package booleans

fun myBoolean(condition: Boolean): Boolean {
    println("The condition you have selected is: \' $condition \' and its type is ${condition.javaClass}")
    return condition
}