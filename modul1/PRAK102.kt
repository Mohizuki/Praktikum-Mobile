package modul1

import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    print("Nilai x = ")
    val x = input.nextInt()
    val hasil = (2 * (x * x)) + (5 * x) - 8;
    print("$hasil")

}