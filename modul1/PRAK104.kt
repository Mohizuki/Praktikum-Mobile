package modul1

fun main() {
    val pekerjaan = pekerjaannopal()
    pekerjaan.Olahraga()
}

class pekerjaannopal(var namaKerjaan: String = "Mahasiswa", val Gaji : Int = 0){
    fun Olahraga() {
        println("""
            Pekerjaan ? $namaKerjaan
            Gaji ? $Gaji
        """.trimIndent())

    }
}