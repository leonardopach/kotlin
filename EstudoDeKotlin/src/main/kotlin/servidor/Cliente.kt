package servidor

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket
import java.net.SocketException
import java.util.*
import kotlin.concurrent.thread

fun main() {
    var clientSocket: Socket? = null

    try {
        clientSocket = Socket("localhost", 12345)
        val output = PrintWriter(clientSocket.getOutputStream(), true)

        print("Digite seu nome de usuário: ")
        val username: String? = readlnOrNull()
        output.println(username)

        val input = BufferedReader(InputStreamReader(clientSocket.getInputStream()))

        val receiveThread = thread {
            try {
                while (true) {
                    val mensagem = input.readLine()
                    if (mensagem != null && !mensagem.startsWith("$username: ")) {
                        println(mensagem)
                    }
                }
            } catch (e: Exception) {
                // Lidar com exceções na thread de recepção
                e.printStackTrace()
            }
        }

        val sendThread = thread {
            try {
                while (true) {
                    val mensagem: String? = readlnOrNull()
                    if (mensagem != null) {
                        if (mensagem.lowercase(Locale.getDefault()) == "quit") {
                            output.println(mensagem)
                            receiveThread.interrupt() // Para interromper a thread de recepção
                            break // Sair do loop
                        }
                        output.println(mensagem)
                    }
                }
            } catch (e: Exception) {
                // Lidar com exceções na thread de envio
                e.printStackTrace()
            } finally {
                // Feche o socket quando o programa terminar
                try {
                    clientSocket.close()
                } catch (ignore: SocketException) {
                    // Ignore a exceção se o socket já estiver fechado
                }
            }
        }
        sendThread.join() // Aguarde a thread de envio terminar
    } catch (e: SocketException) {
        // Lidar com exceções na conexão de socket
        e.printStackTrace()
    } finally {
        // Feche o socket quando o programa terminar
        clientSocket?.close()
    }
}

