fun Palindromo(palavra:String) : Boolean{

    var palindromo:String = palavra.reversed()
    
    var resposta:Boolean

    if(palindromo==palavra){
        resposta=true
    }
    else{
        resposta =false
    }
    return resposta

}