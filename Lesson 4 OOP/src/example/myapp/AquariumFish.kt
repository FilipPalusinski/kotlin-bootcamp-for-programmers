package example.myapp

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark: AquariumFish(), FishAction{
    override val color = "gray"

}
class Plecostomus: AquariumFish(), FishAction{
    override val color = "gold"
    override fun eat(){
        println("eat algae")
    }
}
interface FishAction{
    fun eat()
}






