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
/*
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
*/

//************************************ RANGES Loops com INT ***************************************


/*
fun main() {

    for(i in 0..3) {      // menor igual a 3 ;
        print(i)
    }
    print(" ")

    for(i in 0 until 3) { // menor que 3;
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) { // de 2 até 8 de 2 em 2, ou seja INCREMENTOS DE 2 em 2;
        println(i)
    }

    for(i in 3 downTo 0) { // de 3 DECREMEMTAMDO até ZERO, ou seja  3, 2, 1, 0 ;
    println(i)
    }

}
*/

//***************************************** Ranges: If's e loops com Char *************************************

/*
fun main() {    //no range com letras funciona da mesma forma do que com numeros.

    for (c in 'a'..'d') {    // aqui ele ira imprimir , abcd , ou seja todo intervalo de "a" até "d"
        print(c)

    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // aqui o 'for' esta DECREMENTANDO de "z" a "s" de 2 em dois, printando "zxvt"
        print(c)
    }

    val x= 2;
    if(x in 1..5) {
        print("x is in range from 1 to 5") // x esta no intervalo de 1 a 5? ou seja podemos usar a condicional para iterar (range = intervalo)
    }

    if(x !in 6..10) {
        print("x is not in range from 6 to 10")
    }

}

*/
//***************************************** VERIFICAÇÃO DE IGUALDADE (EQUALITY CHECKS) *********************************

 //  ==  COmpara a estrutura dos objetos
// === Compara a mesma referencia em memória

// fun main() {
// //setOf não aceita valores iguais no array
// val authors = setOf("Shakespeare", "Hemingway", "Twain");
// val writers = setOf("Twain", "Shakespeare", "Hemingway");
//
// println(authors == writers);
// println(authors === writers);
// }
//
//
// //********************************** EXPRESSÂO CONDICIONAL (CONDITIONAL EXPRESSIONAL _ )*********************************************
//
//
///*
// fun main() {
// fun max(a: Int, b: Int) = if (a > b) a else b
//
// println(max(99, -42))
// }
// /*

//************************************ LISTAS (LIST) ******************************************************************
/*
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // Criação da lista mutavel com os valores e sendo atribuida a variavel imutavel "  val  "
val sudoers: List<Int> = systemUsers;  //  criada uma cópia para somente LEITURA

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4);
    println("Tot sudoers: ${getSysSudoers().size}");
    getSysSudoers().forEach { i -> println("Some useful info on user $i") }
}

 */

//************************************************** CONJUNTOS ( SET ) *********************************

//Set não são ordenados e não aceita objetos duplicados.
/*
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4";
    val anIssueAlreadyIn: String = "uniqueDescr2";

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}");
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}");

}

 */

// *********************************************** MAP **********************************

//PS: Funções de inicialização -> mapOf() , setOf, mutableOf, mutableMapOf()  ...


const val POINTS_X_PASS: Int = 15 // constant imutavel, ex: pontos de uma viagem por exemplo
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) // array mutavel, de chave e valor, tres valores do mapa. VALORES COM CHAVE = Id, VALOR = PONTOS
val EZPassReport: Map<Int, Int> = EZPassAccounts   // variavel somente leitura, uma ótima pedida para gerar relatórios por exemplo.

//Abaixo ira conferir se o Id existe, e se existir, pegar os pontos ja contidos na conta e somar aos novos pontos.
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {  // se a conta conter a chave Id
        println("Updating $accountId...")
        EZPassAccounts[accountId] =
            EZPassAccounts.getValue(accountId) + POINTS_X_PASS // Pegar o valor da conta e somar com os pontos(15)
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")

    }

}

//Abaixo função que imprime relatório de contas
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
        k, v -> println("ID $k: credit $v")  // for Each percorre nossa lista de pontos do Id e gera um relatório com chave e valor .
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}



















