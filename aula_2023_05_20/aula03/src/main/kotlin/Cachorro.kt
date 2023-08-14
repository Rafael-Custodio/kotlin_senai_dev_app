class Cachorro {

    //Atributos
    var nomeCachorro: String
    var raca: String
    var peso: Int

    constructor(nomeCachorro: String, raca: String, peso: Int)
    {
        //this. vai ser uma referência da variável da classe
        this.nomeCachorro = nomeCachorro
        this.raca = raca
        this.peso = peso
    }

    //Métodos
    fun Falar()
    {
        println("Au Au")
    }
    fun FazerXixi()
    {
        println("Xiiiiiiiiiiiiiiii")
    }
    fun Correr()
    {
        println("Pocotó")
    }

}
