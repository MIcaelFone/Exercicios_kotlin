fun ordenar_lista_sem_metodo(lista: ArrayList<Int>):ArrayList<Int>{
    //Pega o item
    for ( i in 0 until lista.size) {
        for (j in i + 1 until lista.size) {

            if(lista[i]>lista[j]){
                var temp =lista[i]
                lista[i]=lista[j]
                lista[j]=temp

            }
        }
    }
    return lista

}