package modul1

import java.util.*

fun main(args: Array<String>){
    var input = Scanner(System.`in`)
    println("Input bilangan = ")
    var angka = input.nextInt()
    var kelipatan = angka

    for (i in 1..7) {
        angka += kelipatan
        if(angka%2==0 || angka%3==0) {
            print("$angka ")
        }
    }
}