package example.myapp.decor

data class Decoration(val rocks: String ) {

}
fun makeDecorations() {
    val decoration1 = Decoration("grantie")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "_", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
fun main(args: Array<String>){
   //makeDecorations()
    makeDecorations2()
}