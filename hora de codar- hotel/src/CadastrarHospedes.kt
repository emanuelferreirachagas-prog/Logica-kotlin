package hotel

fun cadastro() {

    println("\n====================================================")
    println("Cadastrar Hospedes")
    println("\n====================================================")

    println("Selecione uma opção:")
    println("1.Cadastrar\n" +
            "2.Pesquisar por nome exato\n" +
            "3.Pesquisar por prefixo\n" +
            "4.Listar ordenado (A-Z)\n" +
            "5.Atualizar cadastro\n" +
            "6.Remover cadastro\n" +
            "7.Voltar")
    var opcao = readln().toInt()

    when (opcao){
        1 -> cadastrar()
        2 -> pesquisaexato()
        3 -> pesquisaprefixo()
        4 -> listaordenado()
        5 -> atualizar()
        6 -> remover()
        7 -> voltar()
        else -> erro()
    }
}
fun cadastrar() {
    print("Digite o nome completo: ")
    val nome = readln()
    if (nome.isNotBlank()) {
        bancoDeDados.add(nome)
        println("'$nome' cadastrado com sucesso!")
    } else {
        println("Nome não pode ser vazio.")
    }
}
fun pesquisaexato() {
    print("Digite o nome exato para busca: ")
    val nome = readln()
    if (bancoDeDados.contains(nome)) {
        println("Usuário '$nome' encontrado no sistema.")
    } else {
        println("Usuário não encontrado.")
    }
}
fun pesquisaprefixo() {
    print("Digite o início do nome: ")
    val prefixo = readln()
    val resultados = bancoDeDados.filter { it.startsWith(prefixo, ignoreCase = true) }

    if (resultados.isNotEmpty()) {
        println("Resultados encontrados: $resultados")
    } else {
        println("Nenhum nome começa com '$prefixo'.")
    }
}
fun listaordenado() {
    if (bancoDeDados.isEmpty()) {
        println("A lista está vazia.")
    } else {
        println("Lista de Nomes (A-Z):")
        bancoDeDados.sorted().forEach { println("- $it") }
    }
}
fun atualizar() {
    print("Digite o nome que deseja alterar: ")
    val nomeAntigo = readln()
    val index = bancoDeDados.indexOf(nomeAntigo)

    if (index != -1) {
        print("Digite o novo nome: ")
        val novoNome = readln()
        bancoDeDados[index] = novoNome
        println("Cadastro atualizado!")
    } else {
        println("Nome não encontrado.")
    }
}
fun remover() {
    print("Digite o nome para remover: ")
    val nome = readln()
    if (bancoDeDados.remove(nome)) {
        println("'$nome' removido com sucesso.")
    } else {
        println("Nome não encontrado.")
    }
}
fun voltar(){
    inicio()
}