fun main(){
    val bank = Banco("DigiOne", 1220)
    println(bank.nome)
    println(bank.numero)

    val banco2 = bank.copy("Banco2")

    println(banco2.nome)
    println(banco2.numero)
}