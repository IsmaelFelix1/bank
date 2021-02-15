package teste

import Analista
import Funcionario
import Gerente
import Pessoa
import java.math.BigDecimal

fun main() {
    val manu = Gerente("Manu", "1122334422", 5000.0)
    imprimeRelatorioFuncionario.imprime(manu)
}

