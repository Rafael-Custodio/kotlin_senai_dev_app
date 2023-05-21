import java.util.Scanner

fun main(args: Array<String>) {

    var terminal = Scanner(System.`in`)

//    var usuario = Usuario()
//    usuario.nome = "Rafael"
//    usuario.email = "rafael@email.com"
//    usuario.idade = 36
//    usuario.senha = "123"
//    println(usuario.NomeEEmail())

    println("\n=======================================")
    println("=======================================\n")

//    var usuario02 = Usuario()
//    usuario02.nome = "Karen"
//    usuario02.email = "karen@email.com"
//    usuario02.idade = 38
//    usuario02.senha = "456"
//    println(usuario02.NomeEEmail())

    println("\n=======================================")
    println("=======================================\n")

    var novoCarro = Carro("abc1234", "Celta", "Chevrolet")
    println(novoCarro.marca)

    println("\n=======================================")
    println("=======================================\n")

    var carro02 = Carro("def5678", "Etios", "Toyota")
    println(carro02.placa)

    println("\n=======================================")
    println("=======================================\n")

    var arrayCarros = arrayOf<Carro>()

    arrayCarros = arrayCarros.plus(novoCarro)
    arrayCarros = arrayCarros.plus(carro02)

    for (carro in arrayCarros) {
        println(carro.placa)
        println(carro.modelo)
        println(carro.Andar())
    }
    println("\n=======================================")
    println("=======================================\n")

    var pintcher = Cachorro("Fredy", "Pintcher", 3)
    pintcher.Falar()
    pintcher.Correr()
    pintcher.FazerXixi()

    println("\n=======================================")
    println("=======================================\n")

    println("Informe a ação do doguinho: ")
    println("1 - Falar, 2 - Correr, 3 - Fazer Xixi, 0 - Sair")

    var acao = terminal.nextInt()

    while (acao != 0) {
        if (acao == 1) {
            pintcher.Falar()
        } else if (acao == 2) {
            pintcher.Correr()
        } else if (acao == 3) {
            pintcher.FazerXixi()
        } else {
            println("O " + pintcher.nomeCachorro + " está dormindo no momento.")
        }
        println("Informe a ação do doguinho: ")
        println("1 - Falar, 2 - Correr, 3 - Fazer Xixi, 0 - Sair")
        acao = terminal.nextInt()
    }

    println("\n=======================================")
    println("=======================================\n")

    var novoUsuario = Usuario("Lucas", "lucas@email.com")

    //Atribuindo ao meu usuário um novo pet
    novoUsuario.AdicionarPet(pintcher)

    // ? -> Se eu tiver
    println(novoUsuario.pet?.nomeCachorro)

    println("\n=======================================")
    println("=======================================\n")

    novoUsuario.carrosUsuario.add(novoCarro)
    novoUsuario.carrosUsuario.add(carro02)

    for (carro in novoUsuario.carrosUsuario)
    {
        println(carro.modelo)
    }

}