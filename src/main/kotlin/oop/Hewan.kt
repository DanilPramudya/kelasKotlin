package oop

class Hewan {
    val kaki = 2
    var mata = 2

    fun makan (){
        println("nyam nyam")

    }

    fun buangAir(){
        println("zzzzzz")
    }
}

class kucing : Hewan() {
    override val kaki = 4
    val isMamal = true
}

class Kakatua : Hewan(){
   val isBird = true
}

class ayam : Hewan(){
    val isMamal = false
}