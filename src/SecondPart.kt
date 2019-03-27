import java.util.*

fun main(args: Array<String>){
    val tempreture = 10

    /*In kotlin variable can be directly assigned with function or expression
     which can give one output at a time.*/

    val isHot = if(tempreture>50) true else false
    println(isHot)

    /*In kotlin, expression can be assigned with other value .for
     include expression : ${expression} */

    val message = "You are ${if(tempreture>50) "fried" else "safe"} fish"
    println(message)

    /*args[0] denotes kotlin*/

    println("Hello, ${args[0]}")
    println("********************************************")
    feedTheFish()

}
fun feedTheFish(){

    /*In kotlin variable can be directly assigned with function or expression
     which can give one output at a time.*/

    val day = randomDay()
    val food = "pallets"
    println("The fish is feeded $food on $day .")

}
fun randomDay(): String{
    val week = listOf<String>("Saturday","Sunday","Monday","Tuesday",
        "Wednesday","Thursday","Friday")
    /*From any list if we want to pick random value then we have to write
    * following command: list[Random().nextInt(number of elements in which we
     want to pick one.)]*/
    return week[Random().nextInt(7)]
}