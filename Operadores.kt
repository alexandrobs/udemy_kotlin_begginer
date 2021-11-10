class Operadores {
}

//sobre when
fun operacao(a: Int, b: Int, operation: String): Int {
    when (operation) {
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

fun main() {
    //tabela verdade com operadores
    //conjuncao && e
    //para retornar true precisam as duas premissas serem verdadeiras
    val a: Int = 1
    val b: Int = 2

    if (a > 1 && b > 1) {
        println("true")
    } else {
        println("false")
    }

    //disjuncao || ou
    //para retornar true basta que uma das premissas sejam verdadeiras
    if (a > 1 || b > 1) {
        println("true")
    } else {
        println("false")
    }

    var bool: Boolean = false
    //negacao ! not
    //para negar uma premissa
    if (!bool) {
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

    //for
    val nome: String = "Alexandro Bernardino da Silva"

    for (c in nome) {
        print("$c ")
    }

    //usando for com Range e uso de step
    for (i in 1..100 step 2) {
        if (i < 2) {
            println()
        }
        if (i != 80) {
            print("$i ")
        }
    }

    //usando o for com downTo
    for (i in 100 downTo 0) {
        println()
        print("$i ")
    }

    //usando o while, o break que pode ser usado em while e for
    //o while executa somente se a condição for verdadeira
    var count: Int = 0

    while (count < 100) {
        println()
        print(count)
        count++
        if (count == 50) {
            break
        }
    }

    //usando o do while, diferente do while aqui o do executa mesmo se a condição do while for falsa,
    //mas executa apenas uma vez o que tem dentro do do

    var countDoWhile: Int = 0
    do {
        println()
        println(countDoWhile)
        countDoWhile++
    }   while (countDoWhile < 100)

    //Testando a Teste.java aqui dentro
    println()
    //testando o operador ternario do java
    //Teste().ternario()

    //testando o NullSafe do kotlin
    //Isso dispara um NullPointerException
    //Teste().meuNome()
    //NullSafe em kotlin
    var str: String? = null
    //Elvis operator para acessar propriedades que podem ser nulas
    println(str?.length)
    //ou
//    if (str != null){
//        println(str.length)
//    }
    //ou
    //ou esse operador !! ele diz ao kotlin pra retornar o que tiver que retornar
    // assumindo voce o erro que dispare isso
    //println(str!!.length)

}

