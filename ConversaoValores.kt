class ConversaoValores {
}

/**
 *  Double 64
 *  Float  32
 *  Long   64
 *  Int    32
 *  Short  16
 *  Byte    8
 */

fun main(){

    fun imprimeValor(value: Long){
        println(value)
    }

    fun imprimeValorB(value: Int){
        println(value)
    }

    var valueA: Int = 100
    var valueB: Long = 100000
    //isso da erro, esta esperando um Long e passei um Int
    //tenta fazer o contrário esperar um Int e passar um Long, da erro tb eu testei
    //imprimeValor(valueA)
    //agora se eu fazer a conversao explicita da certo
    //imprimeValorB(valueB.toInt())
    //lista com principais conversores de valores
//    valueA.toInt()
//    valueA.toLong()
//    valueA.toChar()
//    valueA.toByte()
//    valueA.toDouble()
//    valueA.toFloat()
//    valueA.toShort()
    //convertendo texto em Int
    //println("1000".toInt())

    //como tratar excecoes
    //try, catch e finally
    try {
        println("asasas".toInt())
    }
    catch (ex1: NumberFormatException){
        println("O valor não é um número")
    }
    catch (ex2: Exception){
        println("Ocorreu uma falha")
    }
    finally {
        println("sokasokaoskaoks")
        println("ksoaksoaksoasoa")
    }
}