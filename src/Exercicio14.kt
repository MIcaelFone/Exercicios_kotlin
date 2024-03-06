fun String.IsPalindromo():Boolean{
    var palavra= this.trim().lowercase()
    var palindromo_palavra:String = palavra.reversed()
    var resultado : Boolean
    if(palavra==palindromo_palavra){
         resultado=true
    }else{
        resultado=false
    }
        return resultado

}