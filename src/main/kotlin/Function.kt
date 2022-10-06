fun helloPolban() {
    println("Hello Polban")
}

fun helloSiswa(nama: String) {
    println("Hello Apa Kabar $nama")

}

fun nilaiAkhir(uts:Int, uas:Int): Int {
    return(uts + uas) / 2
}

fun main () {
    val nama = "danil"

    helloPolban()
    helloSiswa(nama)

    val nilai = nilaiAkhir(60, 70)

    println("Nilai Akhir $nama adalah: $nilai")
}
