package hotel

lateinit var nome: String //utilizado em mais de uma função
lateinit var senha: String // utilizado em mais de uma função

fun main(){
    println("Bem vindo ao Hotel Skd!")
    println("Digite o nome de usuario:")
    nome = readln()
    println("Digite sua senha:")
    senha = readln().toString()

    println("Confirme sua senha:")
    var teste = readln().toString()
    if (teste != senha){
        var erro = 0
        for (i in 1..3){
            println("Digite corretamente:")
            teste = readln()
            if (teste != senha){
                erro = erro + 1
            }else {
                break
            }
        }
        if (erro >=3) {
            errosenha()
        }
    }else {
        inicio()
    }

}
fun inicio(){
    println("Bem-vindo ao Hotel Skd, $nome. É um imenso prazer ter você por aqui!")

    println("Escolha uma opção: ")
    println("1.Reserva de Quartos\n" +
            "2.Cadastro de Hóspedes\n" +
            "3.Eventos\n" +
            "4.Ar-Condicionado\n" +
            "5.Abastecimento\n" +
            "6.Relatórios Operacionais\n" +
            "7.Sair")
    var escolha = readln().toInt()


    when (escolha){
        1 -> criarreservas()
        2 -> cadastro()
        3 -> eventos()
        4 -> arcondicionado()
        5 -> Abastecimento()
        6 -> Relatorios()
        7 -> Sair()
        else -> erro()
    }
}
fun Sair() {
    println("Você realmente deseja sair?")
    println("1 -> Sim.\n" + "2 -> Não")
    var confirmação = readln().toInt()
    if (confirmação == 1) {
        println("Até logo!")
    } else if (confirmação == 2) {
        inicio()
    }else {
        erro()
    }
}

fun errosenha(){
    println("Senha invalida.")
    println("Tente novamente.")
    System.exit(1)
}

fun erro(){
    println("Opção invalida")
    System.exit(1)


}