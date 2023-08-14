import java.util.Scanner

fun main(args: Array<String>) {

    /*
    1.	Escreva um programa que peça ao usuário para digitar duas palavras e determine qual delas tem mais caracteres.
     */

    println("Digite a primeira palavra: ")
    var palavra01 = Scanner(System.`in`)
    var resposta01 = palavra01.nextLine()
    println("Você digitou a palavra: " + resposta01 + ", e ela tem " + resposta01.length + " caracteres." )

    println("Digite a segunda palavra: ")
    var palavra02 = Scanner(System.`in`)
    var resposta02 = palavra02.nextLine()
    println("Você digitou a palavra: " + resposta02 + ", e ela tem " + resposta02.length + " caracteres." )

    println("")

    if (resposta01.length > resposta02.length){
        println("Portanto, a primeira palavra (" + resposta01 + ") possui mais caracteres!")
        }else if (resposta02.length > resposta01.length){
            println("Portanto, a segunda palavra (" + resposta02 + ") possui mais caracteres!")
        }else{
            println("Portanto, as duas palavras tem o mesmo tamanho.")
    }
}