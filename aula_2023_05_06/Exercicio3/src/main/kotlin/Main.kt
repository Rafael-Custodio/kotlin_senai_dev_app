import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar sua idade e determine se ele é maior ou menor de idade.
     */

    println("Digite a sua idade: ")
    var idade01 = Scanner(System.`in`)
    var resposta01 = idade01.nextInt()

    if (resposta01 >= 18){
        println("Atualmente você tem " + resposta01 + " anos, logo, você É MAIOR DE IDADE.")
    }else{
        println("Atualmente você tem " + resposta01 + " anos, logo, você É MENOR DE IDADE.")
    }
}