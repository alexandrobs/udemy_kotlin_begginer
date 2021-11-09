class ControleFluxo {

}

fun calculaSeEMaiorOuMenor(idade: Int) {
    if (idade >= 18) {
        println("É maior de idade")
    } else {
        println("É menor de idade")
    }
}

fun calculaSeEMaiorOuMenorBoolean(idade: Int) : Boolean {
    return idade >= 18
}

//funcao com mais de um parametro e retorno float
fun calculaBonus(cargo: String, salario: Float) : Float {

    val bonus: Float

    if (cargo == "Gerente Junior"){
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Senior"){
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }

    return bonus
}

fun main() {
    calculaSeEMaiorOuMenor(18)
    println(calculaSeEMaiorOuMenorBoolean(18))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Senior", 1000f))
    println(calculaBonus("Coordenador", 1000f))
    val valor = 15
    val str = if (valor == 10) "Sim" else "Não"
    println(str)
}


