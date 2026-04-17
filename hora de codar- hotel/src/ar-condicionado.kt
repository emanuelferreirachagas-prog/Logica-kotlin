package hotel
import java.util.Scanner

fun arcondicionado(){
        val sc = Scanner(System.`in`)
        val orcamentos = mutableListOf<Orcamento>()
    println("\n====================================================")
    println("Ar-Condicionado")
    println("\n====================================================")

        do {
            println("\n--- Cadastro de Orçamento ---")
            print("Nome da empresa: ")
            val nomeEmpresa = sc.next()

            print("Valor por aparelho (R$): ")
            val valorPorAparelho = sc.nextDouble()

            print("Quantidade de aparelhos: ")
            val qtdAparelhos = sc.nextInt()

            print("Percentual de desconto (ex: 10): ")
            val percDesconto = sc.nextDouble()

            print("Quantidade mínima para desconto: ")
            val qtdMinimaDesconto = sc.nextInt()

            print("Valor do deslocamento (R$): ")
            val valorDeslocamento = sc.nextDouble()

            val totalCalculado = calcularOrcamento(
                valorPorAparelho,
                qtdAparelhos,
                percDesconto,
                qtdMinimaDesconto,
                valorDeslocamento
            )


            orcamentos.add(Orcamento(nomeEmpresa, totalCalculado))

            println("O serviço de $nomeEmpresa custará R$ ${"%.2f".format(totalCalculado)}")

            print("\nDeseja informar novos dados? (S/N): ")
            val continuar = sc.next().uppercase()

        } while (continuar == "S")


        if (orcamentos.size >= 2) {
            exibirRelatorioFinal(orcamentos)
        } else {
            println("\nÉ necessário informar ao menos duas empresas para comparação.")
        }
    }

    fun calcularOrcamento(
        valorAparelho: Double,
        quantidade: Int,
        desconto: Double,
        minimo: Int,
        deslocamento: Double
    ): Double {
        val bruto = valorAparelho * quantidade

        val valorDesconto = if (quantidade >= minimo) {
            bruto * (desconto / 100)
        } else {
            0.0
        }

        return bruto - valorDesconto + deslocamento
    }

    fun exibirRelatorioFinal(lista: List<Orcamento>) {
        val menor = lista.minByOrNull { it.total }!!
        val maior = lista.maxByOrNull { it.total }!!

        val difPercentual = ((maior.total - menor.total) / menor.total) * 100

        println("\n========================================")
        println("RELATÓRIO DE ORÇAMENTOS")
        println("O orçamento de MENOR valor é o de ${menor.nome} por R$ ${"%.2f".format(menor.total)}")
        println("O orçamento de MAIOR valor é o de ${maior.nome} por R$ ${"%.2f".format(maior.total)}")
        println("Diferença percentual: ${"%.2f".format(difPercentual)}% mais caro que a melhor proposta.")
        println("========================================")
        inicio()
    }
