var lambda_soma={a:Int,b:Int -> println("Resultado da soma:"+ (a + b))}

var lambda_subtracao={ a:Int, b:Int -> println("Resultado da subtração:" + (a - b))}

var lambda_multiplicacao={a:Int,b:Int -> println("Resultado de multiplicação:"+a*b)}

var lambda_divisao={a:Int,b:Int -> println("Resultado da divisão:"+a/b)}

fun operacaoMatematica(valor:Int, valor2:Int, lmbda: (Int, Int) -> Unit){

    var result = lmbda(valor,valor2)
    return result
}