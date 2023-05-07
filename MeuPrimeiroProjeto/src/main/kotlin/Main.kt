import java.util.Scanner

fun main(args: Array<String>) {

    // comentário

    /*
    bloco de comentário
     */

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //variável sem declarar o tipo
    var minhaVariavel = "Agora tem um texto"

    // ::class consultar o tipo de variável
    println(minhaVariavel::class)

    // variável declarando o tipo
    var texto: String = "123"

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    // concatenação
    var nome: String = "Joãozinho"
    var sobrenome: String = "das Neves"
    println(nome + " " + sobrenome)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    // bloco de texto
    var blocoTexto = """
       Bloco novo
       de texto
       bunitao
    """.trimIndent()
    //trimIndent retira espaços antes e depois das palavras
    println(blocoTexto)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    // Char (caractere único, declarado com aspas simples)
    var char: Char = 'R'
    println(char)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //tipo Int
    var inteiro01: Int = 10
    var inteiro02: Int = 20
    println(inteiro01::class)
    println(inteiro01 + inteiro02)

    //tipo Long, maior que Int, " L " no final
    var long: Long = 123456789123456789L
    println(long::class)
    println(long)

    //tipo inteiro, menor que Int
    var short: Short = 12312
    println(short::class)
    println(short)

    //tipo Double, números fracionados
    var double: Double = 12.5
    println(double::class)
    println(double)

    //tipo Float, números fracionados, maior que Double, " f " no final
    var float: Float = 15.6f
    println(float::class)
    println(float)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    var boolean: Boolean = true
    println(boolean)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    // variável nula
    var nulo = null
    println(null)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //conversão de tipo de dados
    var tipoInteiro = 16
    var novo02 = tipoInteiro.toString()
    println(novo02)
    println(novo02::class)

    var textoNovo = "17"
    var novo03 = textoNovo.toInt()
    println(novo03)
    println(novo03::class)

    var doubleNovo = 18.5
    var novo04 = doubleNovo.toInt()
    println(novo04)
    println(novo04::class)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //if, else
    if (tipoInteiro == 16) {
        println("Isso é verdadeiro")
    } else {
        println("Isso não é verdadeiro")
    }

    //if, else if, else
    if (tipoInteiro == 16) {
        println("Ação 01")
    } else if (tipoInteiro == 17) {
        println("Ação 02")
    } else {
        println("Ação 03")
    }

    //when
    when (tipoInteiro) {
        16 -> {
            println("Isso é 16")
        }

        else -> {
            println("Isso não é 16")
        }
    }

    //alterando o valor da variável com if, else
    var inteiroComCondicao = 0
    if ((1 + 1) == 2) {
        inteiroComCondicao = 1
        println("Novo valor da variável é " + inteiroComCondicao)
    } else {
        inteiroComCondicao = 2
        println("Novo valor da variável é " + inteiroComCondicao)
    }

    //if, else modelo kotlin
    var inteiroComCondicaoNova = if ((1 + 1) == 2) {
        4
    } else {
        5
    }
    println("O valor da variável é " + inteiroComCondicaoNova)

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //função
    fun MinhaPrimeiraFuncao() {
        println("Oi, eu sou a PRIMEIRA função.")
    }
    //chamando a função
    MinhaPrimeiraFuncao()

    fun MinhaSegundaFuncao( texto: String )
    {
        println("Exibindo o texto: " + texto)
    }
    MinhaSegundaFuncao("Oi, eu sou a SEGUNDA função.")

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    fun Soma(numero01: Int, numero02: Int): Int{
        var resultado = numero01 + numero02
        return resultado
    }

    var conta = Soma(3, 7)
    println( conta )

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    //scanner = recebendo dados do terminal
    println("Digite algo")
    var respostaTerminal = Scanner(System.`in`)
    var resposta = respostaTerminal.nextLine()
    println( resposta )

    println("Você gostaria de saber se 1 + 1 é igual a 2 ?")
    var terminal = Scanner(System.`in`)
    var novaResposta = terminal.nextLine()

    //toUpperCase formata tudo para maiúsculo
    if ( novaResposta.toUpperCase() == "SIM"){
        println("1 + 1 é Sim igual a 2")
    }else{
        println("Que pena")
    }

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    var terminal02 = Scanner(System.`in`)
    println("Informe um número qualquer: ")
    var numeroterminal02 = terminal02.nextInt()
    println("O número que você digitou, mais 10 é igual a " + (numeroterminal02 + 10))

    //---------------------------------------------------------------
    //---------------------------------------------------------------

    var terminal10 = Scanner(System.`in`)
    println("Informe um número qualquer: ")
    var numero01terminal = terminal10.nextInt()
    var somaTerminal = numero01terminal + 2;

    println( somaTerminal > 10)
    println( somaTerminal < 10)
    println( somaTerminal == 10)
    println( somaTerminal >= 10)
    println( somaTerminal >= 10)

    // ( + ) Soma
    // ( - ) Subtração
    // ( * ) Multiplicação
    // ( / ) Divisão

    // ( == ) Igual
    // ( > ) Maior
    // ( < ) Menor
    // ( >= ) Maior ou Igual
    // ( <= ) Menor ou Igual
    // ( != ) Diferente

}