import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar um caractere e determine se ele é uma vogal ou uma consoante
     */

    println("Digite uma letra qualquer do alfabeto: ")
    var letra01 = Scanner(System.`in`)
    var resposta01 = letra01.nextLine()

    if (resposta01.toUpperCase() == "A" || resposta01.toUpperCase() == "E" || resposta01.toUpperCase() == "I" || resposta01.toUpperCase() == "O" || resposta01.toUpperCase() == "U"){
        println("A letra " + resposta01 + " é uma VOGAL.")
    }else{
        println("A letra " + resposta01 + " é uma CONSOANTE.")
    }





}