fun main(){
    //untuk array
    var cars = arrayOf("Honda", "toyota","bmw")

    cars.forEach { car ->
        println("ini adalah mobil $car")

    }

    val honda = cars.filter { car-> car == "Honda" }
    println(honda)

    var nilaiMahasiswa = arrayOf(30, 70, 85, 64, 66)

    val lulusMatkulProgramming = nilaiMahasiswa.filter {
        nilai -> nilai >= 71
    }

    println(lulusMatkulProgramming)
}