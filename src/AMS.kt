import java.util.*
import java.util.Calendar.*

//var is changeable data-type & val is non-changeable data-type

val question = "What day is it today?"
var day = Calendar.getInstance().get(DAY_OF_WEEK)
fun main(args: Array<String>){

    dayOfWeek()
    loop()
}
fun dayOfWeek(){

    println(question)


    /*when.. generally work as switch statement.*/

    when(day){
        1 -> println("Today is Sunday.")
        2 -> println("Today is Monday")

        /* in 3..5 -> println("") ; can be an element (means:is day within 3,4,5)*/

        3 -> println("Today is Tuesday")
        4 -> println("Today is Wednesday")
        5 -> println("Today is Thursday")
        6 -> println("Today is Friday")
        7 -> println("Today is Saturday")
        else ->println("There is no matching.Please check the code.")
    }

    /*if(condition-fulfill) {Execute statement}
    Here, condition = day in 1..3 (means:is day within 1,2,3);
    condition may be = true/false/ a==b/a>b/a>=b/a<b/a<=b/name.equals("robi")___etc.
    */

    if(day in 1..3){
        println("First half of the week")
    }
    else if (day in 4..7) {
        println("Second hald of the week")
    } else {
        println("Middle of the week.")
    }
}
fun loop(){

    //for 10 times loop
    println("Use: i in 0..9 to get:")
    for(i in 0..9){
        println(i)
    }
}