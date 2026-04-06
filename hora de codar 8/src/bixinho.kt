class bixinho(var nome: String) {
    var fome = 50
    var felicidade = 50
    var cansaco = 50
    var idade = 1

    fun alimentar(){
        fome -= 10
        println("$nome foi alimentado!!")
    }
    fun brincar(){
        felicidade += 10
        cansaco += 5
        println("$nome está mais feliz!!")
    }
    fun descanso(){
        cansaco -= 10
        println("$nome está descansando")
    }
    fun status(){
        println("Status do $nome")
        println("$nome está com $idade anos")
        println("quantidade da fome: $fome")
        println("quantidade de felicidade: $felicidade")
    }
    fun passartempo(){
        fome += 3
        felicidade -= 3
        cansaco += 10
        idade += 1
        println("$nome precisa de cuidados pra crescer")
    }

}