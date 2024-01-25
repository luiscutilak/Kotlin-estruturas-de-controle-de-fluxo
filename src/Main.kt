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
/*
fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {  // quando ele encontra a condição verdadeira ele não executa as outras.
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")   >>>>>>>>>>>>> SIMILAR AO DEFAULT
    }
}

class MyClass
 */

//*********************  WHEN EXPRESSION - parecido com switch/case ********************************

/*
fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}
fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
 */

//******************************* LOOPS - FOR (ESTRUTURAS DE REPETIÇÃO)**************************************
/*
fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")
    for(cake in cakes) {
        println("Yammii its a ${cake} cake!")
    }
}

 */

//******************************* WHILE e DO WHILE **********************************************************

// WHILE -> ENQUANTO a condição for verdadeira.
/*
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}

 */

//****************************** ITERATORS *********************************************

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {

        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("zebra"), Animal("lion"));
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}
