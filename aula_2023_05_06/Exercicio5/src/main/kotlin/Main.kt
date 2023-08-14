import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar a idade de duas pessoas e determinar se elas têm a mesma idade
     */

    println("Digite a idade da PRIMEIRA pessoa: ")
    var idade01 = Scanner(System.`in`)
    var resposta01 = idade01.nextInt()

    println("Digite a idade da SEGUNDA pessoa: ")
    var idade02 = Scanner(System.`in`)
    var resposta02 = idade02.nextInt()


    if (resposta01 == resposta02){
        println("As duas pessoas POSSUEM a mesma idade.")
    }else{
        println("As duas pessoas NÃO possuem a mesma idade.")
    }

}