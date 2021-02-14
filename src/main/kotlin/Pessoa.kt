class Pessoa {

    var name: String = "Ismael"
    var cpf: String = "064.443.030.42"
    var idade: Int = 20
}

fun main(){
    val p1 = Pessoa();

    println(p1.name)
    println(p1.cpf)
    println(p1.idade)
}