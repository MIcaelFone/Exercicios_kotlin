class Funcionario() {

    var name: String =""

    var salario : Double = 0.0

    var maior_salario : Double =0.0
    var nome_funcionario :String= " "

    fun funcionario_maior_salario(lista: ArrayList<Funcionario>):String{

        for (funcionario in lista ) {
            if (funcionario.salario > maior_salario) {


                maior_salario=funcionario.salario
                nome_funcionario=funcionario.name

            }


        }

        return "Nome do funcionário:"+nome_funcionario+ " "+"salário:"+maior_salario

    }
}