package projetoPortaria

class Console {
    fun readInt(msg: String): Int {
        var retorno: Int? = null
        while (retorno == null || retorno <= 0) {
            print(msg)
            val info = readlnOrNull()

            if (info != null && info != "" && info > 0.toString()) {
                retorno = info.toIntOrNull()

                if (retorno == null) {
                    println("Valor Inválido")
                }
            }

        }
        return 0
    }
}