fun main(args: Array<String>) {
    /*1 - Faça um programa que leia um valor e imprima
    sua tabuada (aceite apenas números entre 1 e 10).
    Imprima, logo em seguida, a tabuada ao contrário
     */

    print("Digite um valor e veja sua tabuada: ")
    var numero = readLine()!!.toInt()

    for(x in 10 downTo 1){

        println("$numero X $x = ${numero * x}")
    }
}