import java.io.File
import java.io.PrintWriter

fun rnota() {
    println("Insira o Nome da Nota:")
    var nome :String = reader.next()
    val file = File("$nome.txt")
    println(message = "Insira o Texto Desejado: ")
    val text = reader.next()

    PrintWriter(file, Charsets.UTF_8).use { it.print(text) }
}