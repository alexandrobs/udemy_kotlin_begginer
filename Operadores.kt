class Operadores {
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
}

