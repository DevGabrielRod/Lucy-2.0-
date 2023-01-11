import LocalShell.Companion.shel
import java.util.*

val reader = Scanner(System.`in`)

fun main() {

    println("Insira a Opção Desejada:")
    println("[ 1 ]Calculadora;")
    println("[ 2 ]Pesquisa WEB(#EM DESENVOLVIMENTO#);")
    println("[ 3 ]Registrar Nota;")
    println("[ 4 ]Execultar Shell(#EM DESENVOLVIMENTO#)")

    var inp:Int = reader.nextInt()

    when (inp) {
        1 -> println("[ 1 ]Calculadora")
        2 -> println("[ 2 ]Pesquisa WEB")
        3 -> println("[ 3 ]Registrar Nota")
        4 -> println("[ 4 ]Execultar Shell")
        else -> println("Opção Inválida!")
    }

    when (inp) {
        1 -> calc()
        2 -> pweb()
        3 -> rnota()
        4 -> shel()
        else ->  println("Opção Inválida!")
    }
}