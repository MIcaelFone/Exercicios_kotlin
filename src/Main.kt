//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun exercicioum() {
        println("Digite um valor:")
        var valor: Int = readLine()?.toInt() ?: 0
        var exercicio01 =verificando_numero(valor)
        println(exercicio01)
    }

    fun exerciciodois() {
        var lista = ArrayList<Int?>()
        println("Digite a quantidade de itens:")
        var quantidade_items = readLine()!!.toInt()

        for (i in  1 ..quantidade_items){
           print("Insira um valor:")
           var number : Int? = readLine()?.toInt()
           lista.add(number)
        }

        var exercicio02 = maior_valor_array(lista)
        println(exercicio02)
    }


    fun exerciciotres() {

        print("Digite a quantidade pessoas para cadastrar:")

        val quantidade_pessoas: Int = readLine()!!.toInt()

        var lista = ArrayList<Pessoa> ()

        for (i in 1..quantidade_pessoas) {

            print("Digite o nome da pessoa:")

            var nome = readLine().toString()

            print("Digite a idade da pessoa:")

            var idade = readLine()!!.toInt()

            var pessoa = Pessoa()
            pessoa.name = nome
            pessoa.idade = idade

            lista.add(pessoa)
        }

        var listas=lista.sortedBy { it.name }

        for (pessoas in listas){
            println("Nome:"+pessoas.name)
            println("Nome:"+pessoas.idade)
        }

    }


    fun exercicioquatro(){
        print("Digite uma palavra:")
        var palavra : String = readLine()!!

        print(Palindromo(palavra))
    }

    fun exerciciocinco(){
        println("Digite o primeiro a ser comparado:")
        var valor:Int=readLine()!!.toInt()
        println("Digite o segundo a ser comparado:")
        var valor_2:Int=readLine()!!.toInt()
        Maior_valor(valor, valor_2)
    }

    fun exercicioseis(){

        println("Digite um valor de limite:")
        var limite : Double = readLine()!!.toDouble()

        println("Digite um valor de saldo:")
        var saldo : Double = readLine()!!.toDouble()

        var conta = ContaBancaria(saldo, limite)

        println("Digite um valor para o saque:")
        var valor_saque : Double = readLine()!!.toDouble()

        print(conta.saque(valor_saque))

    }

    fun exerciciosete(){

        println("Digite a quantidade de palavras a serem inseridas:")

        var quantidade_palavra : Int = readLine()!!.toInt()

        var lista = ArrayList<String>()

        for (i in 1 .. quantidade_palavra){

            println("Digite uma palavra:")

            var palavra : String = readLine().toString()

            lista.add(palavra)

        }
        print(String_mais_longa_lista(lista))
    }

    fun exerciciooito(){

        print("Digite a quantidade pessoas para cadastrar:")

        val quantidade_pessoas: Int = readLine()!!.toInt()

        var lista = ArrayList<Funcionario> ()

        for (i in 1..quantidade_pessoas) {

            print("Digite o nome de um funcionário:")

            var nome = readLine().toString()

            print("Digite o salário desse funcionário:")

            var salario = readLine()!!.toDouble()

            var funcionario= Funcionario()
            funcionario.name = nome
            funcionario.salario = salario

            lista.add(funcionario)

        }
        var funcionario= Funcionario()
        println(funcionario.funcionario_maior_salario(lista))

    }

    fun exercicionove(){
        println("Digite a quantidade números para serem adicionados:")
        var quantidade_itens :Int =readLine()!!.toInt()
        var lista=ArrayList<Int>()
        for (i in 1.. quantidade_itens){
            println("Digite um número:")
            var item :Int = readLine()!!.toInt()
            lista.add(item)

        }
        println(ordenar_lista_sem_metodo(lista))
    }

    fun exercicioten(){
        println("Digite um valor para a base:")
        var base = readLine()!!.toDouble();
        println("Digite um valor para a altura:")
        var altura = readLine()!!.toDouble()
        var Triangulo = triangulo()
        Triangulo.base=base
        Triangulo.altura=altura
        println(Triangulo.area())

    }
    fun exercicioeleven(){
        println("A quantidade de itens a serem adcionadas:")
        var quantidade_itens : Int = readLine()!!.toInt()
        var lista =ArrayList<String>()

        for ( i in 1.rangeTo(quantidade_itens)){
            println("Digite uma palavra:")
            var palavra :String = readLine().toString()
            lista.add(palavra)
        }
        println(lista_string_letra_A(lista))

    }

    fun exerciciotwelve(){
        val dictionary = mapOf("key" to "chave", "anotherKey" to "Outra Chave","House" to "Casa")
        println(dictionary)
    }
    fun exerciciothirteen(){
        println("Digite um valor 1:")
        var valor1 = readLine()!!.toInt()
        println("Digite um valor 2:")
        var valor2 = readLine()!!.toInt()
        println("Opções:)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ")
        println("1-Soma")
        println("2-Substração")
        println("3-Multiplicação")
        println("4-Divisão")
        println("Escolha uma opção:")

        val opcao = readLine()!!.toInt()

        if (opcao ==1){
            operacaoMatematica(valor1,valor2,lambda_soma)
        }
        else if (opcao ==2){
            operacaoMatematica(valor1,valor2,lambda_subtracao)
        }
        else if (opcao ==3){
            operacaoMatematica(valor1,valor2,lambda_multiplicacao)
        }

        else if (opcao ==4){
            operacaoMatematica(valor1,valor2,lambda_divisao)
        }

    }


    fun exercicioquartoze(){

        val palavra01= "Ana"
        val palavra02= "Amanda"
        val palavra03="arara"

        var teste01 = palavra01.IsPalindromo()
        println("Resultado do teste 01:"+teste01)

        var teste02 = palavra02.IsPalindromo()
        println("Resultado do teste 02:"+teste02)

        var teste03 = palavra03.IsPalindromo()
        println("Resultado do teste 03:"+teste03)

    }


    fun exercicioquinze(){

        println("Digite a quantidade de números a serem inseridos:")

        var quantidade_itens:Int = readLine()!!.toInt()

        var list =ArrayList<Int>()

        for (i in 1..quantidade_itens){

            println("Digite um a ser inserido:")
            var numero:Int= readLine()!!.toInt()
            list.add(numero)

        }

        println("Escolha uma operação para realizar com essa lista:")
        println("1-Somando todos os valores")
        println("2-Dobrando todos os valores")
        println("3-Buscando os números pares")
        var option= readLine()!!.toInt()

        if(option==1){
            somando_lista(list,soma_valores)
        }
        else if(option==2){

            dobrando_valores(list,valores_dobro)
        }
        else if(option==3){
            buscando_pares(list,numeros_pares)
        }

    }


   fun rodando_projeto() {

       for (i in 1..15) {
           println(i.toString() + "-" + " Exercício" + " " + i.toString())
       }

       println("Escolha uma opção:")

       var opcao: Int = readLine()!!.toInt()

       when (opcao) {
           1 -> exercicioum()
           2 -> exerciciodois()
           3 -> exerciciotres()
           4 -> exercicioquatro()
           5 -> exerciciocinco()
           6 -> exercicioseis()
           7 -> exerciciosete()
           8 -> exerciciooito()
           9 -> exercicionove()
           10 -> exercicioten()
           11 -> exercicioeleven()
           12 -> exerciciotwelve()
           13 -> exerciciothirteen()
           14 -> exercicioquartoze()
           15 -> exercicioquinze()
           else -> "Opção inválida"

       }
   }
    rodando_projeto()






}