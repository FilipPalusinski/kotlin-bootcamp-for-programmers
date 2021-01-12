

fun main(){
    //runPairsAndTriples()
    //runLists()
    runHashMaps()
}

fun runHashMaps(){
    //hashMaps that matches symptoms, the keys, with diseases of fish, the values.
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    //retrieve the disease value based on the symptom key
    //using get
    println(cures.get("white spots"))
    //using square brackets
    println(cures["red sores"])

    //symptom that isn't in the map
    println(cures["scale loss"])

    //no match but set default value
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    //no match but do something else
    println(cures.getOrElse("bloating"){"No cure for this"})

    //mutable Map of elements, mean data can be changed
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}

fun runLists(){
    //sum of integer elements
    val list = listOf(1, 5, 3 ,4)
    println(list.sum())

    //sum of string elements
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy{ it.length })

    //size of list
    println(list2.size)

    //list elements iterated and printed with space
    for (s in list2.listIterator()) {
        print("$s ")
    }

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