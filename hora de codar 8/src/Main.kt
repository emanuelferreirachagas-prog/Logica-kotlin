fun main() {
    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readln()
    val pet = bixinho(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Verificar o status de $nomePet")
        println("4. Passar idade do $nomePet")
        println("5. Sair")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.status()
            4 -> pet.passartempo()
            5 ->{ println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }

            else -> println("Escolha inválida. Tente novamente.")
        }
    }
}
