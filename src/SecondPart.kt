import java.util.*

fun main(args: Array<String>){

    feedTheFish()

}
fun feedTheFish(){

    /*In kotlin variable can be directly assigned with function or expression
     which can give one output at a time.*/

    val day = randomDay()
    val food = foodOfFish(day)
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

/*Function call with argument .In kotlin , expression can be used
* directly after return.*/

fun foodOfFish(day : String) : String{
   return when(day){
        "Monday"->"pallets"
        "Tuesday" ->"flakes"
        "Wednesday" ->"granules"
        "Thursday" ->"plankton"
        "Friday" ->"Mosquitos"
        else ->"fasting"
    }
}