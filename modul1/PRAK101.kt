package modul1

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    println("Waktu Sekarang: ")
    //val waktu = readLine()
    val waktu = input.nextLine()
    println("Nama Anda: ")
    //val nama = readLine()
    val nama = input.nextLine()
    println("Umur Anda: ")
    //var num1 = input.nextInt()
    //val umur = Integer.valueOf(readLine())
    val umur = input.nextInt()
    //println("Suhu Tubuh Anda: ")
    //var suhu = input.nextFloat()
    //val suhu = (35..37).random()
    var suhu = String.format("%.2f", Random.nextDouble(35.00, 37.00))
    println("Selamat $waktu, $nama. \n Umur anda $umur Tahun. \n Suhu Tubuh anda $suhu derajat Celcius.")
}