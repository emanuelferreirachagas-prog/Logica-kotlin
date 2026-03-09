fun main(){
    println("escolha a forma geometrica: ")
    println("1. Retângulo")
    println("2. Quadrado")
    println("3. losango")
    println("4. Trapézio")
    println("5. Paralelogramo")
    println("6. Triângulo")
    println("7. Círculo")
    var Forma = readln()!!.toInt()

    if (Forma .equals(1)){
        Retangulo()
    }else if (Forma .equals(2)){
        Quadrado()
    }else if (Forma .equals(3)){
        losango()
    }else if (Forma .equals(4)){
        trapezio()
    }else if (Forma .equals(5)){
        paralelogramo()
    }else if(Forma .equals(6)){
        triangulo()
    }else if (Forma .equals(7)){
        circulo()
    }else
        println("erro, selecione um dos numeros abaixo")
      main()
}
fun Retangulo(){

    println("digite a base:")
    var base = readln()!!.toInt()
    println("digite a altura")
    var altura = readln()!!.toInt()

    var Resultado = base * altura
    println("A área do Retângulo é: $Resultado")

    main()
}
fun Quadrado(){

    println("digite o valor do lado:")
    var lado = readln()!!.toInt()
    var resultado = lado * lado
    println("a área do quadrado é $resultado")
    main()

}
fun losango(){

    println("digite a diagonal maior: ")
    var dm = readln()!!.toInt()
    println("digite a diagonal menor: ")
    var dn = readln()!!.toInt()

    var resultado = dm * dn / 2
    println("A area do losango é $resultado")
    main()

}
fun trapezio(){

    println("digite a base maior")
    var bm = readln()!!.toInt()
    println("digite a base menor")
    var bn = readln()!!.toInt()
    println("digite a altura:")
    var altura = readln()!!.toInt()

    var resultado = (bm + bn)* altura / 2
    println("a area do trapezio é $resultado")
    main()

}
fun paralelogramo(){
    println("digite a base:")
    var base=readln()!!.toInt()
    println("digite a altura:")
    var altura=readln()!!.toInt()

    var resultado = base * altura
    println("a area é : $resultado")
    main()

}
fun triangulo(){

    println("digite a base")
    var base=readln()!!.toInt()
    println("digite a altura")
    var altura=readln()!!.toInt()

    var resultado = base*altura / 2
    println("a area do triangulo é $resultado")
main()
}
fun circulo(){

    println("digite o raio:")
    var raio=readln()!!.toDouble()
    var resultado = 3.14159 / raio
    println("a area é $resultado")
    main()

}