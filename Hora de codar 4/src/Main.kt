fun main() {
    var nome : String
    var lista = mutableListOf<String>()

    while (true) {
        println("Digite um estudante, ou digite 'pare' para finalizar")
        nome = readln()
        if (nome == "pare") {
            break
        }
        lista.add(nome)
    }
    println("quantidade de alunos foi: ${lista.size}")
    println("lista de alunos")
    for (nome in lista){
        println(nome)
    }
    hora2()
}
fun hora2(){
    var nome2: String
    val lista = arrayListOf<String>("Terra","Plutão","Marte","Vênus","Saturno","Júpiter")

    println("digite o nome de um planeta: ")
    nome2 = readln()

    if (nome2 in lista ){
        println("o planeta está na lista")
    }else {
        println("o planeta nao esta na lista")
    }
hora3()
}
fun hora3() {
    var frutas = mutableListOf<String>("banana", "pera", "laranja", "morango", "uva", "manga")

    while (frutas.isNotEmpty()){
        println("lista de frutas:")
    for (fruta in frutas) {
        println(fruta)
    }

    println("escolha uma fruta:")
    var frutaD = readln()
    if (frutaD in frutas) {
        frutas.remove(frutaD)
        println("compra efetuada")
    } else {
        println("fruta indisponivel")
    }
        println()
    }

    println("lista de compras finalizada")

}
