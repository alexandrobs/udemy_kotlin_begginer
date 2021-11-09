class Operadores {
}

//sobre when
fun operacao(a: Int, b: Int, operation: String): Int{
    when (operation){
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        "Multiplicacao" -> {
            return a * b
        }
        else -> {
            println("Operação não reconhecida")
            return 0
        }
    }
}

fun main(){
    //tabela verdade com operadores
    //conjuncao && e
    //para retornar true precisam as duas premissas serem verdadeiras
    val a: Int = 1
    val b: Int = 2

    if(a > 1 && b > 1){
        println("true")
    }else{
        println("false")
    }

    //disjuncao || ou
    //para retornar true basta que uma das premissas sejam verdadeiras
    if(a > 1 || b > 1){
        println("true")
    }else{
        println("false")
    }

    var bool: Boolean = false
    //negacao ! not
    //para negar uma premissa
    if(!bool){
        println(a)
    }

    //operador Elvis
    var teste: Int? = null
    var testa: Int = teste ?: 100
    println(testa)

    println(operacao(10, 20, "Soma"))
    println(operacao(20, 10, "Subtracao"))
    println(operacao(10, 20, "Multiplicacao"))
    println(operacao(10, 20, "Eteration"))

    val x: Int = 0

    //when sem Range para intervalos
    when {
        x > 1 && x < 100 -> {
            println("Século")
        }
        else -> {
            println("Nada")
        }
    }

    //when com Range para intervalos
    val z: Int = 0
    when (z) {
        in 1..100 -> {
            println("Século")
        }
        else -> {
            println("Nada")
        }
    }
}

