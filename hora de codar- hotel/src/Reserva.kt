package hotel
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Reserva(
    var nomeHospede: String,
    var tipoquartos: String,
    var numeroquarto: Int,
    var dias: Int,
    var diaria: Double
){
    var subtotal = calculo()
    fun calculo(): Double{
     return diaria * dias * multiplicação()
    }
    private fun multiplicação() = when(tipoquartos.uppercase()){
        "E" -> 1.35
        "L" -> 1.80
        else -> 1.0
    }

    var taxa = taxaservico()
    fun taxaservico(): Double{
        return subtotal * 0.10
    }

    var total = total1()
    fun total1(): Double{
        return subtotal + taxa
    }

}

data class Hospede(
    var nome: String,
    val dataCadastro: LocalDateTime = LocalDateTime.now()
){
    fun dataFormatada(): String{
        val formatar = DateTimeFormatter.ofPattern("dd/MM/yyyyHH:mm")
        return dataCadastro.format(formatar)
    }
}
data class Orcamento(
    val nome: String,
    val total: Double
){}
