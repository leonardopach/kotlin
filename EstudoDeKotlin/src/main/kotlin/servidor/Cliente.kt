package servidor

import java.net.Socket
import java.util.Scanner
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.IOException

fun main() {
    val clientSocket = Socket("localhost", 12345)

    val usernameInput = Scanner(System.`in`)
    print("Digite seu nome de usuário: ")
    val username = usernameInput.nextLine()

    val output = PrintWriter(clientSocket.getOutputStream(), true)

    try {
        // Envie o nome de usuário do cliente para o servidor
        output.println(username)

        // Inicie uma thread para receber mensagens
        val receiveThread = Thread {
            val input = BufferedReader(InputStreamReader(clientSocket.getInputStream()))
            try {
                while (true) {
                    val mensagem = input.readLine()
                    if (mensagem != null && !mensagem.startsWith("$username: ")) {
                        println(mensagem)
                    }
                }
            } catch (e: Exception) {
                println("Encerrado com sucesso!!")
            }
        }
        receiveThread.start()

        // Loop para enviar mensagens
        val scanner = Scanner(System.`in`)
        while (true) {
            val mensagem = scanner.nextLine()
            val outputt = PrintWriter(clientSocket.getOutputStream(), true)
            outputt.println(mensagem)

            // Verifique se o usuário digitou "quit" e, se sim, desconecte
            if (mensagem.equals("quit", ignoreCase = true)) {
                clientSocket.close()
                break
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
