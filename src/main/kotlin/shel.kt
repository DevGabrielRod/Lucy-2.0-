import java.io.BufferedReader
import java.io.Closeable
import java.io.IOException
import java.io.InputStreamReader
import java.util.logging.Logger


class LocalShell {
    @Throws(IOException::class)
    fun executeCommand(command: String) {
        val commands = ArrayList<String>()
        commands.add("/bin/bash")
        commands.add("-c")
        commands.add(command)
        var br: BufferedReader? = null
        try {
            val p = ProcessBuilder(commands)
            val process = p.start()
            val `is` = process.inputStream
            val isr = InputStreamReader(`is`)
            br = BufferedReader(isr)
            var line: String
            while (br.readLine().also { line = it } != null) {
                println("Retorno do comando = [$line]")
            }
        } catch (ioe: IOException) {
            log.severe("Erro ao executar comando shell" + ioe.message)
            throw ioe
        } finally {
            secureClose(br)
        }
    }

    private fun secureClose(resource: Closeable?) {
        try {
            resource?.close()
        } catch (ex: IOException) {
            log.severe("Erro = " + ex.message)
        }
    }

    companion object {
        private val log = Logger.getLogger(LocalShell::class.java.name)
        @Throws(IOException::class)
        @JvmStatic
        fun shel() {
            println("*-*-*-*-*-*-*ATENCAO!!!!-*-*-*-*-*\n-*-*-*-*VERSAO DE TESTES!!-*-*-*-*")
            val shell = LocalShell()
            shell.executeCommand("ls -a ~")
        }
    }
}