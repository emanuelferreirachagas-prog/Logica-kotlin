fun main(){
    println("digite um valor: ")
    var numero1 = readln().toInt()
    println("Digite mais um valor: ")
    var numero2 = readln().toInt()
    println("Digite mais um valor: ")
    var numero3 = readln().toInt()
    println("Digite mais um valor: ")
    var numero4 = readln().toInt()

    println("o primeiro valor foi $numero1")
    println("o ultimo valor foi $numero4")
    if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
        println("o maior numero é $numero1")
    }else if (numero2 > numero1 && numero2 >numero3 && numero2 > numero4){
        println("o maior numero é $numero2")
    }else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
        println("o maior numero é $numero3")
    }else {
        println("o maior numero é o $numero4")
    }
    hora7()
}
fun hora7(){
    var numero: Double
    var soma = 0.0
    var numeros = DoubleArray(6)

    for (i in 0 until 6){
        println("Digite um numero: ")
        numero = readln().toDouble()

        numeros[i] = numero

        if (numero < 72){
            soma = soma + numero
        }
    }
        println("numeros informados: ")
    for (i in 0 until 6){
        println(numeros[i])
    }
    println("soma dos numeros menos que 72 foi: $soma")
    hora8()
}
fun hora8(){
    var numero: Double
    var media = 0.0
    var numeros= DoubleArray(4)
    for (i in 1 until 4){
        println("digite um numero: ")
        numero = readln().toDouble()

        numeros[i] = numero
        if (numeros[i] > 0 && numeros[i] < 10){
            media += numeros[i]
        } else {
            println("Numero invalido, deve ser maior que zero e menor que 10")
        }
    }
    media /=4

    println("Media: $media")

    if (media>5){
        println("Voce passou no teste")
    }else {
        println("Tente novamente")
    }
        hora9()
}
fun hora9(){
    println("Digite sua idade:")
    var idade = readln().toInt()

    if (idade >= 16){
        println("voce pode votar")
    }else{
        println("voce nao pode votar")
    }
    hora10()
}
fun hora10(){
    println("Digite seu genero:")
    println("1. feminino")
    println("2. masculino")
    var genero = readln().toInt()
    while (genero >= 3 && genero <= 0){
        println("digite 1 ou 2")
        genero = readln().toInt()
    }

    println("digite sua altura")
    var altura = readln().toDouble()

    if (genero == 1){
        var r1 = (62.1 * altura) - 58
        println("o seu peso ideal é: $r1")
    }else{
        var r2 = (72.7 * altura) - 44.7
        println("o seu peso ideal é: $r2")
    }
    hora11()

}
fun hora11(){
    println("digite um valor")
    var numero1 = readln().toDouble()
    println("digite outro valor")
    var numero2 = readln().toDouble()

    println("digite uma opção:")
    println("1. Adição")
    println("2, Subtração")
    println("3. Divisão")
    println("4. - Multiplicação")
    var opção = readln().toInt()
    while (opção>= 5 && opção<=0){
        println("digite um valor valido")
        opção = readln().toInt()
    }

    if (opção == 1){
        var resultado1 = numero1 + numero2
    } else if (opção == 2){
        var resultado2 = numero1 - numero2
    } else if (opção == 3){
        var resultado3 = numero1 / numero2
    } else{
        var resultado4 = numero1 * numero2
    }


}
