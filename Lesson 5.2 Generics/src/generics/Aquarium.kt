package generics


fun main(){
    genericsExample()
}

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing){
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

}
inline fun<reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R
inline fun<reified T:WaterSupply> WaterSupply.isOfType() = this is T


fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample() {
    //val aquarium = Aquarium<TapWater>(TapWater())
    //You can omit angle brackets and what between them because Kotlin has type inference.
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    //any type value passed to T
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)
//
//    //null value passed to T
//    val aquarium3 = Aquarium(null)
//    if(aquarium3.waterSupply == null){
//        println("waterSupply is null")
//    }
//
//    class Aquarium2<T: Any>(val waterSupply: T)
//    //val aquarium4 = Aquarium2(null)
//    //null cant be passed
//
//    class Aquarium3<T: WaterSupply>(val waterSupply: T){
//        fun addWater(){
//            check(!waterSupply.needsProcessing) { "water supply needs processing first" }
//            println("adding water from $waterSupply")
//        }
//    }
//    //val aquarium5 = Aquarium3("String")
//    //for this case string cant be pass because its not a subtype of WaterSupply.
//    val aquarium4 = Aquarium3(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

    addItemTo(aquarium)

    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner)

    isWaterClean(aquarium)
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<TapWater>())
}