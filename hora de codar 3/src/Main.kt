var aprovados = 0
var reprovados = 0

fun main() {
    var contador = 30
    while (contador >= 0){
        println(contador)
        contador += 1
    }
    println("Boom!!")
 execicio2()
}
fun execicio2(){
    println("Digite um valor: ")
    var numero = readln().toInt()

    println("Digite o segundo:")
    var numero2 = readln().toInt()
    while (numero2 <= 0){
        println("Digite outro valor")
        numero2 = readln().toInt()
    }
    var resultado = numero / numero2

    println("a divisao foi: $resultado")

    exercicio3()
}
fun exercicio3 (){
    var numero = 10
    while (numero >= 0){
        println("$numero")
        numero -= 1
    }
    exercicio4()
}
fun exercicio4(){
    var numero = 15
    var soma = 0
    var media = 0
    while (numero <=100){
        soma += numero
        numero +=1
        media += 1
    }
  var resultado = soma / media
    println("O resultado é $resultado")
    exercicio5()
}
fun exercicio5(){
    println("Digite um valor")
    var numero = readln().toInt()

    println("Digite um valor")
    var numero2 = readln().toInt()
    var soma = 0
    var media = 0
    while (numero <= numero2){
        println("$numero")
        soma += numero
        numero +=1
        media += 1
    }
    var resultado = soma / media
    println("a media dos dois numeros foi: $resultado")
    exercicio6()
}
fun exercicio6() {
    println("Digite a nota do aluno:")
    var numero = readln().toInt()

    println("Digite a nota do aluno")
    var numero2= readln().toInt()

    var media = (numero + numero) /2

    if (media >= 9.5){
        println("o aluno foi aprovado")
        aprovados += 1
    } else {
        println("aluno foi reprovado")
        reprovados += 1
    }
    println("Calcular a media de outro aluno? \n 1.sim \n 2.nao")
    var opcao = readln().toInt()

    when (opcao) {
        1 -> main()
    }
    println("a quantidade de aprovados foi: $aprovados\n a quantidade de reprovados foi: $reprovados")
    exercicio7()
}
fun exercicio7(){
   println("Digite um valor: ")
    var numero1 = readln().toInt()
    while (numero1<0 && numero1 > 10){
        println("DIgite um numero valido: ")
        numero1 = readln().toInt()
    }
    println("Digite um valor: ")
    var numero2 = readln().toInt()
    while (numero2<0 && numero2 > 10){
        println("DIgite um numero valido: ")
        numero2 = readln().toInt()
    }
    println("Digite um valor: ")
    var numero3 = readln().toInt()
    while (numero3<0 && numero3 > 10){
        println("DIgite um numero valido: ")
        numero3 = readln().toInt()
    }
    println("Digite um valor: ")
    var numero4 = readln().toInt()
    while (numero4<0 && numero4 > 10){
        println("DIgite um numero valido: ")
        numero4 = readln().toInt()
    }
    println("Digite um valor: ")
    var numero5 = readln().toInt()
    while (numero5<0 && numero5 > 10){
        println("DIgite um numero valido: ")
        numero5 = readln().toInt()
    }
    println("Digite um valor: ")
    var numero6 = readln().toInt()
    while (numero6<0 && numero6 > 10){
        println("DIgite um numero valido: ")
        numero6 = readln().toInt()
    }
    var media = (numero1 + numero2 + numero3 + numero4 + numero5 + numero6) / 6

    println("O valor da media dos 6 numeros é: $media")
    exercicio8()
}
fun exercicio8(){
    println("Informe um valor:")
    var N =readln().toInt()

    while (N >= 1){
        println(N)
        N -= 1
    }
    exercicio9()
}
fun exercicio9(){
    var numero = 100
    while (numero <= 110){
        println(numero)
        numero +=1
    }
    exercicio10()
}
fun exercicio10() {
    var dentro = 0
    var fora = 0
    println("Digite 10 valores:")
    for (i in 1..10) {
        var numero = readln().toInt()
        if (numero >= 24 && numero <=42){
            dentro += 1
        } else {
            fora += 1
        }
    }
    println("$dentro de 24 e 42")
    println("$fora de 24 e 42")
    exercicio11()
}
fun exercicio11(){
    println("Digite um valor")
    var N = readln().toInt()

    if (N <= 1){
        println("valor deve ser pelo menos um")
        exercicio11()
    }
    for (i in 1..N) {
        println("tabuada do $i")

        for (j in 1..10) {
            println("$i x $j =")
            var resultado = i * j
            println(resultado)
        }
    }
}