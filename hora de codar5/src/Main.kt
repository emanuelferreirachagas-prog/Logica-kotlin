import kotlin.concurrent.thread

var senha = 0
var saldo = 150.0
var opcao = 0
fun main(){
        println("Bem vindo\nDigite o nome de usuario:")
        var nome = readln()

        println("digite uma senha para login:")
        senha = readln().toInt()

        println("bem vindo ao banco  skd!!")
        Thread.sleep(1500L)
    menu()

    }
fun menu() {
    println("Selecione uma opção")

    println("1. Ver saldo")
    println("2. extrato")
    println("3. Saque")
    println("4. Depósito")
    println("5. Trasferencia")
    println("6. Sair")

    opcao = readln().toInt()

    when(opcao){
        1 -> veri()
        2 -> veri()
        3 -> veri()
        4 -> fazerDeposito()
        5 -> veri()
        6 -> sair()
        else -> erro()
    }
    }
fun veri(){
    println("Verifique sua senha:")
    var Senha = readln().toInt()

    while (Senha != senha){
        println("Digite sua senha novamente")
        veri()
    }
    when(opcao){
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        5 -> fazerTrasferencia()
    }



}
fun verSaldo(){
    println("seu saldo é de: $saldo")
    Thread.sleep(1000L)
    menu()

}
fun verExtrato() {
    println("10/02 - Sorveteria - 50")
    println("15/02 - Contas - 260")
    println("22/02 - Aluguel - 300")
    menu()
}
fun fazerSaque(){
    println("Qual o valor do saque:")
    var saque = readln().toDouble()
    if (saque > saldo){
        println("quantidade insuficiente")
        fazerSaque()
    }else if (saque <= 0){
        println("valor invalido")
    }else{
        saldo = saldo - saque
    }
    menu()

}
fun fazerDeposito(){
    println("Digite o valor do deposito:")
    var deposito = readln().toDouble()

    while(deposito <= 0){
        println("Digite outro valor:")
        deposito = readln().toDouble()
    }
    saldo = deposito + saldo


}
fun fazerTrasferencia(){
    println("digite a conta pra trasferencia")
    var nome = readln().toString()

    println("digite o valor")
    var valor = readln().toDouble()

    while (valor <= 0){
    println("digite outro valor")
        valor = readln().toDouble()
    }
    while (valor > saldo){
        println("saldo insuficiente, digite outro valor:")
        valor = readln().toDouble()
    }
    println("O valor $valor foi enviado pra conta $nome")
    saldo = valor - saldo


}
fun sair(){
    println("obrigado por ultilizar nosso banco, tenha um bom dia!!!")
}
fun erro(){

    println("essa função nao foi encontrada, escolha outra opção")
    menu()

}