class Usuario {
    /*Todo usuário do meu sistema vai ter vai ter as
    propriedades e métodos de um usuário
     */
    var nome: String = ""
    var email: String = ""
    var idade: Int = 0
    var senha: String = ""
    var pet: Cachorro? = null //Pet não obrigatório

    //mutableList = Lista Variável
    var carrosUsuario: MutableList<Carro> = mutableListOf()

    constructor(nome: String, email: String)
    {
        this.nome = nome
        this.email = email
    }

    fun AdicionarPet(pet: Cachorro)
    {
        this.pet = pet
    }

    fun NomeEEmail(): String
    {
        return nome + ", o email " + email + " e a idade " + idade + " anos."
    }

    fun MudarSenha(novaSenha: String)
    {
        senha = novaSenha
    }
}