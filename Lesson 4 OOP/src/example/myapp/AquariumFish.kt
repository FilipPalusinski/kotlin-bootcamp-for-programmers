package example.myapp

interface FishAction{
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat(){
        println(food)
    }
}

interface FishColor{
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

object GreyColor : FishColor {
    override val color = "grey"
}

class Shark(fishColor: FishColor = GreyColor):
        FishAction by PrintingFishAction("hunt and eat fish"),
        FishColor by fishColor

class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor









