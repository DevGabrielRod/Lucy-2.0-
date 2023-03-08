import LocalShell.Companion.shel
import java.util.*

val reader = Scanner(System.`in`)

fun main() {

    var conti: Boolean = true
    do {
    println("Insira a Opção Desejada:")
    println("[ 1 ]Calculadora;")
    println("[ 2 ]Pesquisa WEB(#EM DESENVOLVIMENTO#);")
    println("[ 3 ]Registrar Nota;")
    println("[ 4 ]Execultar Shell(#EM DESENVOLVIMENTO#)")
    println("[ S ]Sair")

    var inp: String = reader.next()
    var INP = inp.uppercase()


        when (INP) {
            "1" -> println("[ 1 ]Calculadora")
            "2" -> println("[ 2 ]Pesquisa WEB")
            "3" -> println("[ 3 ]Registrar Nota")
            "4" -> println("[ 4 ]Execultar Shell")
            "S" -> println("[ S ]Sair")
            else -> println("Opção Inválida!")
        }

        when (INP) {
            "1" -> calc()
            "2" -> pweb()
            "3" -> println("#Não Disponível!!!")
            "4" -> println("#Não Disponível!!!")
            "S" -> conti = false
            else -> println("Opção Inválida!")
        }
    }while (conti == true)
}