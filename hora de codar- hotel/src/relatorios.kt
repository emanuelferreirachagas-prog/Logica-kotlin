package hotel

fun Relatorios(){
    fun exibirConsolidado(
        quartosOcupados: Int,
        hospedesCadastrados: Int,
        eventosConfirmados: Int,
        receitaHospedagem: Double,
        receitaEventos: Double
    ) {
        val totalQuartos = 20
        val taxaOcupacao = (quartosOcupados.toDouble() / totalQuartos) * 100
        val receitaTotalGeral = receitaHospedagem + receitaEventos

        println("\n====================================================")
        println("RELATÓRIO CONSOLIDADO DO HOTEL")
        println("====================================================")

        println("%-35s %15s".format("DESCRIÇÃO", "VALOR"))
        println("----------------------------------------------------")

        println("%-35s %15d".format("Total de Reservas Confirmadas:", quartosOcupados))
        println("%-35s %14.1f%%".format("Taxa de Ocupação Atual:", taxaOcupacao))
        println("%-35s %15d".format("Hóspedes Cadastrados:", hospedesCadastrados))
        println("%-35s %15d".format("Eventos Confirmados:", eventosConfirmados))

        println("----------------------------------------------------")
        println("FINANCEIRO")
        println("----------------------------------------------------")
        println("%-35s %15s".format("Receita de Hospedagem:", "R$ %.2f".format(receitaHospedagem)))
        println("%-35s %15s".format("Receita de Eventos:", "R$ %.2f".format(receitaEventos)))

        println("----------------------------------------------------")
        println("%-35s %15s".format("TOTAL GERAL ACUMULADO:", "R$ %.2f".format(receitaTotalGeral)))
        println("====================================================\n")
    }
    inicio()
}