fun main(){
    var n1 = 0.0
    var n2 = 0.0
    var nf = 0.0
    var S = 0
    var ap = 0

    println("nota do aluno")
    n1 = readln().toDouble()

    println("segunda nota: ")
    n2 = readln().toDouble()

    nf = n1 + n2
    nf = nf / 2

    if (nf >= 9.5){
        println("aluno aprovado")
        ap += 1
    } else {
        println("aluno reprovado")
    }

    println("Calcular a media de outro aluno?")
    println("1.sim")
    println("2.Não")
    S = readln().toInt()
    if (S .equals(1)){
        main()
    } else {
        println("A quantidade de aprovados foi: $ap")
    }
    hora7()
}
fun hora7(){
    println("Dite um numero de um a dez: ")
    var n1 = readln().toDouble()
    while (n1 < 0 && n1 > 10){
        println("Digite um valor valido: ")
        n1 = readln().toDouble()
    }
    println("Dite um numero de um a dez: ")
    var n2 = readln().toDouble()
    while (n2 < 0 && n2 > 10) {
        println("Digite um valor valido: ")
        n2 = readln().toDouble()
    }
    println("Dite um numero de um a dez: ")
    var n3 = readln().toDouble()
    while (n3 < 0 && n3 > 10) {
        println("Digite um valor valido: ")
        n3 = readln().toDouble()
    }
    println("Dite um numero de um a dez: ")
    var n4 = readln().toDouble()
    while (n4 < 0 && n4 > 10) {
        println("Digite um valor valido: ")
        n4 = readln().toDouble()
    }
    println("Dite um numero de um a dez: ")
    var n5 = readln().toDouble()
    while (n5 < 0 && n5 > 10) {
        println("Digite um valor valido: ")
        n5 = readln().toDouble()
    }
    println("Dite um numero de um a dez: ")
    var n6 = readln().toDouble()
    while (n6 < 0 && n6 > 10) {
        println("Digite um valor valido: ")
        n6 = readln().toDouble()
    }
    var re = n1+n2+n3+n4+n5+n6
    re = re / 6

    println("a media foi: $re")
    hora8()
}
fun hora8(){
    println("escolha um numero:")
    var N = readln().toInt()
    var n = 0
    while (n <= N){
        println("$n")
        n += 1
    }
    hora9()
}
fun hora9(){
    var n1 = 100
    var n2 = 110
    while (n1 <= n2){
        println("$n1")
        n1 += 1
    }
    hora10()
}
fun hora10(){
    var dentro = 0
    var fora = 0
    var valor = 0

    println("Digite 10 valores inteiros: ")

    for (i in 1 .. 10){
        println("valor: ")
        valor = readln().toInt()

        if (valor >= 24 && valor <= 42){
            dentro += 1
        } else {
            fora += 1
        }
    }
    println("$dentro dentro do intervalo")
    println("$fora fora do intervalo")
    hora11()
}
fun hora11(){
    println("digite um valor:")
    var N = readln().toInt()
    if(N < 1){
        println("O numero deve ser pelo menos 1")
        hora11()
    }
    for (i in 1 .. N ){
        println("tabuada do $i")
        for (j in 1 .. 10){

            print("$i X $j = ")
            var resultado = i * j
            println("$resultado")
        }
    }
}