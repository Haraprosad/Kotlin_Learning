package tutorial_practices

import java.lang.IllegalArgumentException

enum class Toss{
    WIN,LOSS,TIE
}

fun main(args: Array<String>){

    println("Input the first character of your expected day.")

    var d = 0
    while(d==0){
        var day:String? = readLine()
        d=1

        //Use of when with argument
        when(day){
            "s","sd"-> println("saturday or sunday")
            "m"->println("Monday")
            "t"->println("Tuesday or Thursday")
            "w"->println("Wednesday")
            "f"->println("Friday")
            else->{println("Your input is wrong.Input again:")
                d = 0
            }
        }
    }
    //Use of when without argument
    var s = "mrr. arif"
     when{
         s.startsWith("mr.") -> println("Male")
         s.startsWith("mrs")|| s.startsWith("ms")->println("Female")
         else -> println("You did wrong")
     }
    var k = when{
        s.startsWith("mr.")-> "Male"
        s.startsWith("mrs")||s.startsWith("ms")->"Female"
        else-> "Anything Else"
    }
    println("k is $k")




    println("Input your number to check :")
    var n = Integer.parseInt(readLine())
    //when use with range
    when(n){
        in 1..4->println("it is in 1 to 4")
        in 5..8->println("it is in 5 to 8")
        else->println("It is not in 1 to 8")
    }
    //when use for data type
    val kb:Any =Toss.LOSS
    when(kb){
        is Int->println("It is intefer type data")
        is String->println("it is String type data")
        is Toss->println("It is Toss type")
        else->println("Toss can't acceptable")
    }
    check(n)

}
//when use with function
fun check(num: Int) = when{
    num>0 -> println("positive")
    num<0->println("negative")
    else->println("zero")
}
