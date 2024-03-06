fun maior_valor_array(Valor: ArrayList<Int?>):String{

    var maior_valor=0

    for (i in Valor){
        if (i != null) {
            if (i>maior_valor) {
                maior_valor = i
            }
        }
    }
    return "Maior valor:" +maior_valor
}
