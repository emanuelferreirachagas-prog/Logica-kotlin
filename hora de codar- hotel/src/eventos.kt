package hotel

import kotlin.math.ceil

fun eventos(){
    println("\n====================================================")
    println("--- Sistema de Reservas de Eventos ---")
    println("\n====================================================")

    print("Digite o número de convidados: ")
    val convidados = readln().toIntOrNull() ?: 0

    if (convidados < 0 || convidados > 350) {
        println("Número de convidados inválido.")
        return
    }

    var auditorio = ""
    if (convidados <= 220) {
        auditorio = "Laranja"
        val extras = if (convidados > 150) convidados - 150 else 0
        println("Use o Auditório Laranja (incluir $extras cadeiras adicionais).")
    } else {
        auditorio = "Colorado"
        println("Use o Auditório Colorado.")
    }

    print("Digite o dia da semana (ex: segunda, sabado): ")
    val dia = readln().lowercase()
    print("Digite a hora inicial (0-23): ")
    val horaInicial = readln().toInt()
    print("Digite a duração do evento (horas): ")
    val duracao = readln().toInt()

    val horaFinal = horaInicial + duracao
    var disponivel = false

    if (duracao in 1..12) {
        when (dia) {
            "segunda", "terca", "quarta", "quinta", "sexta" -> {
                if (horaInicial >= 7 && horaFinal <= 23) disponivel = true
            }
            "sabado", "domingo" -> {
                if (horaInicial >= 7 && horaFinal <= 15) disponivel = true
            }
        }
    }

    if (!disponivel) {
        println("Auditório indisponível para este horário/dia ou duração inválida.")
        return
    }

    print("Digite o nome da empresa: ")
    val empresa = readln()

    val garconsBase = ceil(convidados / 12.0).toInt()
    val garconsReforco = duracao / 2
    val totalGarcons = garconsBase + garconsReforco
    val custoGarcons = totalGarcons * duracao * 10.50

    val litrosCafe = convidados * 0.2
    val litrosAgua = convidados * 0.5
    val totalSalgados = convidados * 7

    val custoCafe = litrosCafe * 0.80
    val custoAgua = litrosAgua * 0.40
    val custoSalgados = (totalSalgados / 100.0) * 34.00
    val custoBuffet = custoCafe + custoAgua + custoSalgados
    val totalGeral = custoGarcons + custoBuffet

    println("\n--- RELATÓRIO TÉCNICO ---")
    println("Auditório: $auditorio | Empresa: $empresa")
    println("Data: $dia às ${horaInicial}h (Término: ${horaFinal}h)")
    println("Convidados: $convidados | Garçons: $totalGarcons | Duração: ${duracao}h")
    println("-------------------------")
    println("Custo Garçons: R$ ${"%.2f".format(custoGarcons)}")
    println("Custo Buffet:  R$ ${"%.2f".format(custoBuffet)}")
    println("TOTAL GERAL:   R$ ${"%.2f".format(totalGeral)}")
    println("-------------------------")

    print("Confirmar reserva? (S/N): ")
    val confirmacao = readln().uppercase()

    if (confirmacao == "S") {
        println("Reserva efetuada com sucesso para $empresa.")
    } else {
        println("Reserva não efetuada.")
    }
    inicio()
}
