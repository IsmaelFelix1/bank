class Pessoa {

    var name: String = "Ismael"
    var cpf: String = "064.443.030.42"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"


}

fun main(){
    val p1 = Pessoa();

    println(p1.pessoaInfo())
}