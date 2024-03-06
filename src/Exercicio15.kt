
val numeros_pares={number:Int -> if(number %2==0) println("$number é par")}

val soma_valores={lista:ArrayList<Int> -> lista.sum()}

val valores_dobro={number:Int ->  number *2}

fun buscando_pares(lista:ArrayList<Int>,lmbda: (Int) -> Unit){

    for (i in lista){
        var verificacao=lmbda(i)
    }

}

fun somando_lista(lista:ArrayList<Int>, lmbda: (ArrayList<Int>) -> Int){

    var somando_a_lista=lmbda(lista)

    println("O resultado da soma:"+somando_a_lista)
}

fun dobrando_valores(lista:ArrayList<Int>,lmbda: (Int) ->Int){

    var lista_em_dobro=ArrayList<Int>()
    for (i in lista){
        var dobrando_valores=lmbda(i)
        lista_em_dobro.add(dobrando_valores)

    }
    println("A lista com seus valores em dobro:"+lista_em_dobro)

}


