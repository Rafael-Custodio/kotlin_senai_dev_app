import java.util.*

fun main(args: Array<String>) {
    //Crie um programa que receba 5 salários de funcionários e aplique um aumento de 10% sobre o valor

    var salarios = Array<Double>(5){0.0}
    var scanner = Scanner(System.`in`)

    println("Digite o PRIMEIRO salário: ")
    var salarios1 = scanner.nextDouble()
    var nsalarios1 = salarios1 * 1.1
    println("Com aumento de 10%, o novo salário é: R$ " + nsalarios1)

    println("Digite o SEGUNDO salário: ")
    var salarios2 = scanner.nextDouble()
    var nsalarios2 = salarios2 * 1.1
    println("Com aumento de 10%, o novo salário é: R$ " + nsalarios2)

    println("Digite o TERCEIRO salário: ")
    var salarios3 = scanner.nextDouble()
    var nsalarios3 = salarios3 * 1.1
    println("Com aumento de 10%, o novo salário é: R$ " + nsalarios3)

    println("Digite o QUARTO salário: ")
    var salarios4 = scanner.nextDouble()
    var nsalarios4 = salarios4 * 1.1
    println("Com aumento de 10%, o novo salário é: R$ " + nsalarios4)







}