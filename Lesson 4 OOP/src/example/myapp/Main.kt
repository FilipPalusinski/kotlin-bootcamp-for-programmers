package example.myapp

import example.myapp.decor.Decoration

fun main(args: Array<String>){
    //buildAquarium()
    makeFish()
}

fun buildAquarium(){
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    val aquarium3 = Aquarium(height = 35, length = 110, width = 50)
    aquarium3.printSize()

    val aquarium4 = Aquarium(width = 25, height = 40, length = 120)
    aquarium4.printSize()

    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()

    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()


}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}