import java.util.*

fun main(args: Array<String>) {

    /*
    Escreva um programa que peça ao usuário para digitar uma idade e determine se ele é adolescente (idade entre 13 e 17 anos).
     */

    println("Digite uma idade qualquer: ")
    var idade01 = Scanner(System.`in`)
    var resposta01 = idade01.nextInt()

    if (resposta01 > 12 && resposta01 < 18){
        println("ADOLESCENTE (idade entre 13 e 17 anos).")
    }else{
        println("NÃO ADOLECENTE (idade não está entre 13 e 17 anos).")
    }
}