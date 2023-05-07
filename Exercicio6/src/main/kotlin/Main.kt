import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar seu salário e determine se ele está abaixo ou acima de média nacional (R$ 2.500,00)
     */

    println("Digite o seu salário: ")
    var salario01 = Scanner(System.`in`)
    var resposta01 = salario01.nextDouble()

    if (resposta01 > 2500){
        println("Se salário está ACIMA da média nacional (R$ 2.500,00 reais)")
    }else{
        println("Se salário está ABAIXO da média nacional (R$ 2.500,00 reais)")
    }


}