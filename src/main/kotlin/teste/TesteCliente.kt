package teste

import Cliente

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "065,003,003.23",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}