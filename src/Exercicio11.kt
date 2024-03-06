fun lista_string_letra_A(lista:ArrayList<String>) : List<String> {

    var lista_ordenadas_dos_A = ArrayList<String>()

    for (i in lista){
        if (i.startsWith("A")) {
            lista_ordenadas_dos_A.add(i)

        }
    }
    return lista_ordenadas_dos_A.sorted()


}