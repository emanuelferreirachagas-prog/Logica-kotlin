fun main(){

    println("Escreva o primeiro numero: ")
    var n1 = readln()!!.toInt()
    println("Escreva o segundo numero: ")
    var n2 = readln()!!.toInt()

    if (n1 > n2) {
        println("O maior numero foi $n1")
    } else
        println("O maior numero foi $n2")
    hora2()
}
fun hora2(){
    println("Escreva um numero: ")
    var numero =readln()!!.toInt()

    if(numero == 0){
        println("o numero é zero")}
    else if (numero > 0){
        println("o numero é positivo")
    } else {
        println("o numero é negativo")
    }
    hora3()
}
fun hora3(){
    println("digite 3 numero a seguir: ")
    var n1 = readln()!!.toInt()
    println("escreva outro: ")
    var n2 = readln()!!.toInt()
    while(n2 .equals(n1)){
        println("escolha outro numero:")
                n2 = readln()!!.toInt()
    }
    println("escreva outro: ")
    var n3 = readln()!!.toInt()
    while (n3 == n1){
        println("escolha outro numero: ")
        n3 = readln()!!.toInt()
    }
    while (n3 == n2){
        println("escolha outro numero: ")
        n3 = readln()!!.toInt()
    }
    if (n1 > n2 && n1 >n3){
        println("o maior numero é $n1")
    }else if (n2 > n1 && n2 > n3){
        println("o maior numero é $n2")
    } else {
        println("o maior numero é $n3")
    }
    hora4()

}
fun hora4(){
    println("digite o primeiro valor: ")
    var n1 =readln()!!.toInt()
    println("digite outro valor: ")
    var n2 = readln()!!.toInt()
    println("digite o ultimo valor: ")
    var n3 = readln()!!.toInt()
    var valor = 0
    if (n1<n2 && n1<n3){
        valor = valor+n1
    } else if (n2<n1 && n2<n3){
        valor = valor + n2
    }else{
        valor = valor + n3
    }
    var soma = (n1 + n2 + n3) - valor

    println("a soma dos maiores numeros é : $soma")
    hora5()
}
fun hora5(){
    var soma = 0

    for (i in 1..6) {
        2
        println("Digite um numero: ")
        var numero = readln().toInt()
        soma = soma + numero
    }
    var medio = soma / 6
    println("Sua Media é : $medio")
}
