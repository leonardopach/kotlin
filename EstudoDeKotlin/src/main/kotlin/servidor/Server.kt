package servidor

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

fun main() {
    val serverSocket = ServerSocket(12345)
    println("Servidor está ouvindo...")

    val clientesConectados = mutableListOf<PrintWriter>()

    while (true) {
        val clientSocket: Socket = serverSocket.accept()
        println("Nova conexão de ${clientSocket.inetAddress.hostAddress}:${clientSocket.port}")

        val input = BufferedReader(InputStreamReader(clientSocket.getInputStream()))
        val output = PrintWriter(clientSocket.getOutputStream(), true)

        val username = input.readLine()
        println("$username se juntou ao chat.")

        for (cliente in clientesConectados) {
            cliente.println("$username se juntou ao chat.")
        }
        clientesConectados.add(output)

        thread {
            while (true) {
                val message = input.readLine() ?: break
                println("$username: $message")
                for (cliente in clientesConectados) {
                    cliente.println("$username: $message")
                }
            }
            println("$username saiu do chat.")
            clientesConectados.remove(output)
            for (cliente in clientesConectados) {
                cliente.println("$username saiu do chat.")
            }
            clientSocket.close()
        }
    }
}
