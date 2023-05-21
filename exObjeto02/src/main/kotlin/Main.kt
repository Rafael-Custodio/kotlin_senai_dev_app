import java.util.Scanner

fun main(args: Array<String>) {

    /*2.	Crie um sistema de pets onde tenha um dono de pet
    com um nome e um número de contato,
    e tenha uma lista de pets com os parâmetros, nome, raça e idade;
     */

    var terminal = Scanner(System.`in`)

    println("Informe o nome do DONO: ");
    var nomeDono = terminal.nextLine();

    println("Informe o telefone de CONTATO: ");
    var telDono = terminal.nextLine();

    var novoDono = DonoDePet(nomeDono, telDono)

    println("Informe a ação: ")
    println("1 - Adicionar Pet´s, 2 - Listar Pet´s, 0 - Sair")
    var acao = terminal.nextInt()

    while (acao != 0){
        if (acao == 1){
            println("Informe o nome do PET: ");
            var nomePet = terminal.next();

            println("Informe a raça do PET: ");
            var racaPet = terminal.next();

            println("Informe a idade do PET: ");
            var idadePet = terminal.nextInt();

            var novoPet = Pets(nomePet, racaPet, idadePet)

            novoDono.petsDono.add(novoPet)

        }else if (acao == 2){
            println("Dono: ${novoDono.nome}, contato ${novoDono.contato}.")
            for (pet in novoDono.petsDono)
            {
                println("Nome Pet: ${pet.nome}, raça ${pet.raca} e idade ${pet.idade}.")
            }
        }
        println("Informe a ação: ")
        println("1 - Adicionar Pet´s, 2 - Listar Pet´s, 0 - Sair")
        acao = terminal.nextInt()
    }
}