import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para informar 3 números e determinar qual é o maior deles
     */

    println("Digite o PRIMEIRO número: ")
    var numero01 = Scanner(System.`in`)
    var resposta01 = numero01.nextInt()

    println("Digite o SEGUNDO número: ")
    var numero02 = Scanner(System.`in`)
    var resposta02 = numero02.nextInt()

    println("Digite o TERCEIRO número: ")
    var numero03 = Scanner(System.`in`)
    var resposta03 = numero03.nextInt()

    if (resposta01 > resposta02 && resposta01 > resposta03){
        println("O PRIMEIRO número, " + resposta01 + ", é o MAIOR.")
    }else if (resposta02 > resposta01 && resposta02 > resposta03){
            println("O SEGUNDO número, " + resposta02 + ", é o MAIOR.")
    }else{
        println("O TERCEIRO número, " + resposta03 + ", é o MAIOR.")

    }



}