package hotel

fun Abastecimento() {
    val volumeTanque = 42
    println("\n====================================================")
    println("Abastecimento")
    println("\n====================================================")
    println("\n[ Posto Wayne Oil ]")
    print("Preço do Álcool: ")
    val alcoolWayne = readln().toDouble()
    print("Preço da Gasolina: ")
    val gasolinaWayne = readln().toDouble()

    println("\n[ Posto Stark Petrol ]")
    print("Preço do Álcool: ")
    val alcoolStark = readln().toDouble()
    print("Preço da Gasolina: ")
    val gasolinaStark = readln().toDouble()

    fun calcularMelhorOpcao(alcool: Double, gasolina: Double): Pair<String, Double> {
        return if (alcool <= gasolina * 0.70) {
            "Álcool" to alcool
        } else {
            "Gasolina" to gasolina
        }
    }

    val (combWayne, pWayne) = calcularMelhorOpcao(alcoolWayne, gasolinaWayne)
    val custoWayne = pWayne * volumeTanque

    val (combStark, pStark) = calcularMelhorOpcao(alcoolStark, gasolinaStark)
    val custoStark = pStark * volumeTanque

    val resultados = listOf(
        Triple("Wayne Oil", combWayne, custoWayne),
        Triple("Stark Petrol", combStark, custoStark)
    ).sortedBy { it.third }

    resultados.forEachIndexed { index, result ->
        val posicao = if (index == 0) "MAIS BARATO" else "MAIS CARO"
        println("${index + 1}º ($posicao): ${result.first}")
        println("   Combustível ideal: ${result.second}")
        println("   Custo para encher 42L: R$ ${"%.2f".format(result.third)}")
    }
    inicio()
}

