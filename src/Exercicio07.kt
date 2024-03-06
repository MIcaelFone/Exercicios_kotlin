fun String_mais_longa_lista(lista : ArrayList<String>) :String{

    var maior_tamanho_palavra  = 0

    var maior_palavra : String = " "

    for (i in lista) {

        if(i.length > maior_tamanho_palavra){

            maior_tamanho_palavra = i.length

            maior_palavra = i

        }

    }
    return "A maior palavra:"+maior_palavra

}