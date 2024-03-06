class ContaBancaria(saldo:Double,limite:Double) {

    var saldo : Double =saldo

    var limite:Double =limite


    fun saque(Valor_saque:Double) :String{

        if(saldo>Valor_saque) {

            saldo= saldo - Valor_saque

        }

        else{

            println("Saldo insuficiente para saque ")
        }

        return "Saldo atual:"+ saldo
    }
}
