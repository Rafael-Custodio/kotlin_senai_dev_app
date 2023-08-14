class DonoDePet {
    var nome: String
    var contato: String
    var petsDono: MutableList<Pets> = mutableListOf()

    constructor(nome: String, contato: String)
    {
        this.nome = nome
        this.contato = contato
    }
}
