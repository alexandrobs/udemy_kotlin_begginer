
//declarar variavel mutavel
var a = "isso é uma string"
//declarar variavel imutavel
val b = "isso é uma string imutavel"

var frase = "Kotlin é uma linguagem"
var descricao = " show!"

var textoGrande: String = """ isso e um texto
    |bem grande, daqueles que não cabem
    |em apenas um linha
    |isso é bem comum de acontecer.
""".trimMargin()

//como declarar uma função
fun calculaBonus(a: Int, b: Int, c: Int){
    println(a + b * c)
}

//funcao calculaBonus em uma unica linha
fun calculaBonus2(a: Int, b: Int, c: Int) = a + b * c

//funcao sem retorno
fun hello(nome: String){
    println(nome)
}

//funcao com retorno
fun helloReturn(nome: String) : String{
    return "Olá $nome"
}

//funcao em uma unica linha
fun helloReturnOneLine(nome: String) = "Olá $nome"

fun main(){
    println("Olá mundo tudo bem")
    a = "mudei"
    println(a)
    //isso da erro
    //b = "eu nao posso mudar"
    println(b)
    println("""$frase$descricao""")
    println(textoGrande)
    //kotlin permite que a gente programe dentro de uma string, exemplo
    println("""${frase.length}""")
    calculaBonus(10, 20, 30)
    hello("Alexandro")
    //pra chamar aquela funcao que retorna tenho que chamar ela
    // dentro de outra funcao no caso a println
    println(helloReturn("Sofia"))
    println(helloReturnOneLine("Auri"))
    println(calculaBonus2(1, 2 , 3))
}