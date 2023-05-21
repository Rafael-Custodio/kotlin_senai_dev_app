import java.util.Scanner

fun main(args: Array<String>) {

    //1.	Crie um sistema de lista de alunos, onde cada aluno possua uma média e um nome

    var terminal = Scanner(System.`in`)
    var terminal02 = Scanner( System.`in` )

    var listaAlunos = arrayOf<Alunos>()

    println("Informe a ação: ")
    println("1 - Adicionar Aluno, 2 - Listar Aluno, 0 - Sair")
    var acao = terminal.nextInt()

    while (acao != 0)
    {
        if (acao == 1)
        {
            println("Informe o nome do Aluno: ");
            var nomeAluno = terminal.nextLine();

            println("Informe a média do Aluno: ");
            var mediaAluno = terminal02.nextInt()

            var novoAluno = Alunos(nomeAluno, mediaAluno)

            listaAlunos = listaAlunos.plus(novoAluno)

        }else if (acao == 2){
            for (aluno in listaAlunos){
                println("Aluno(a): " + aluno.nome + ", média: " + aluno.media)
            }
        }

        println("Informe a ação: ")
        println("1 - Adicionar Aluno, 2 - Listar Aluno, 0 - Sair")
        acao = terminal.nextInt()
    }



}