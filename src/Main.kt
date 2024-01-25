//************  CONTROLE DE FLUXO **************** CONTROL FLOW

// When - parecido com Switch - case
// Loops
// Ranges
// Verificação de Igualdade
// Expressões Condicionais

//************ COLEÇÕES *********************** COLLECTIONS
//* Listas
//* Conjunstos
// * Mapas
// * Extension Functions (filter, map, flatMap etc...)

//*****************************************************************************

//*********************  WHEN STATEMENT - parecido com switch/case ********************************

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass