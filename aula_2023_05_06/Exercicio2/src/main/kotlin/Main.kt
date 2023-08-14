import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar um número inteiro e determine se ele é positivo ou negativo
     */

    println("Digite um número qualquer: ")
    var numero01 = Scanner(System.`in`)
    var resposta01 = numero01.nextInt()
    println("Você digitou o número: " + resposta01)

    if (resposta01 >= 1){
        println("O número digitado é POSITIVO.")
    }else if (resposta01 <= -1){
        println("O número digitado é NEGATIVO.")
    }else{
        println("O número digitado é 0 ou Nulo.")
    }



}