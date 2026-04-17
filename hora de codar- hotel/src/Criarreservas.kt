package hotel

fun criarreservas(){
    println("\n====================================================")
    println("Criar Reserva")
    println("\n====================================================")

    println("Digite o valor da diária:")
     var diaria = readln().toDouble()

    println("Digite a quantidade de dias deseja se hóspedar:")
    var dias = readln().toInt()
    if (dias <= 0 && dias > 30){
        println("Valor inválido, $nome")
        inicio()
    }
    println("Informe o nome completo do hóspede")
    var nomeHospede =readln().lowercase()

    println("informe o tipo do quarto:")
    println("S -> standard\n" +
            "E -> Executivo\n" +
            "L -> luxo\n")
    var tipoquarto = readln().uppercase()

    println("Informe o quarto(1-20):")
    var numeroquarto = readln().toInt()

    val reservaatual = Reserva(nomeHospede,tipoquarto,numeroquarto,dias,diaria)

    println("Hóspede: ${reservaatual.nomeHospede}")
    println("Quarto: ${reservaatual.numeroquarto}(${reservaatual.tipoquartos})")
    println("Subtotal: ${reservaatual.subtotal}")
    println("Taxa de serviço: ${reservaatual.taxa}")
    println("Total: ${reservaatual.total}")

    println("${reservaatual.nomeHospede}, confirmar a reserva?")
    println("1.sim\n" + "2.não")
    var reservar = readln().toInt()
    if (reservar == 1){
        println("Reserva efetuada com sucesso.")
        listareserva.add(reservaatual)
    } else {
        println("Reserva não efetuada.")
    }
    inicio()
}