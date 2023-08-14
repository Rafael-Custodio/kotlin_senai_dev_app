import java.util.Scanner

fun main(args: Array<String>) {

    //Escreva um programa onde informamos 4 idades distintas e depois exibir a maior e a menor idade informada

    var idades = Array<Int>(4){0}
    var scanner = Scanner(System.`in`)

    println("Digite a PRIMEIRA idade: ")
    var idade1 = scanner.nextInt()

    println("Digite a SEGUNDA idade: ")
    var idade2 = scanner.nextInt()

    println("Digite a TERCEIRA idade: ")
    var idade3 = scanner.nextInt()

    println("Digite a QUARTA idade: ")
    var idade4 = scanner.nextInt()

    if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4){
        println("A PRIMEIRA idade digitada É a MAIOR.")
    }else if (idade2 > idade1 && idade2 > idade3 && idade2 > idade4){
        println("A SEGUNDA idade digitada É a MAIOR.")
    }else if (idade3 > idade1 && idade3 > idade2 && idade3 > idade4){
        println("A TERCEIRA idade digitada É a MAIOR.")
    }else{
        println("A QUARTA idade digitada É a MAIOR.")
    }

    if (idade1 < idade2 && idade1 < idade3 && idade1 < idade4){
        println("A PRIMEIRA idade digitada É a MENOR.")
    }else if (idade2 < idade1 && idade2 < idade3 && idade2 < idade4){
        println("A SEGUNDA idade digitada É a MENOR.")
    }else if (idade3 < idade1 && idade3 < idade2 && idade3 < idade4){
        println("A TERCEIRA idade digitada É a MENOR.")
    }else{
        println("A QUARTA idade digitada É a MENOR.")
    }

    




}