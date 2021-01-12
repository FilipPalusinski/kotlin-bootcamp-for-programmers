

fun main(){
    runPairsAndTriples()

}

fun runPairsAndTriples(){
    //pair
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    //triple
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())
    println(numbers.first)

    //pair where the fist part is itself a pair
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println(equipment2.first.second)

    //desctructing pairs
    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    //destructing triples
    val numbers2 = Triple(6,9,42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}