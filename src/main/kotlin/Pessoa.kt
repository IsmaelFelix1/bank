class Pessoa {

    var name: String = "Ismael"
    var cpf: String = "064.443.030.42"
    private set

}

fun main(){
    val p1 = Pessoa();

    println(p1)
    println(p1.name)
    println(p1.cpf)
}