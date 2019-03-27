fun main(args: Array<String>){
    while(true){
        println("Your fortune :" +getFortuneCokie())

        /*To stop the loop break is used.*/

        if(temp.equals("Take it easy and enjoy life!")) break
    }
}
var temp = ""
fun getFortuneCokie():String {

    val fortunes = listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter Your birthday:")

    /*For taking keyboard input : readLine() , command is used.*/

    val birthday = readLine()
    val bb = birthday?.toIntOrNull() ?:1

    /*We can direct write: val birthday = readLine()?.toIntOrNull() ?:1 ,
    *toIntOrNull -->Parses the string as an Int number and returns the
     result or null if
     the string is not a valid representation of a number.
      ** To indicate a nullable variable "?" is used after the variable.
       "?:1" means if value is null then substitute with 1 .*/

    val finalFortune = bb%7

    /*Instead of :val finalFortune = bb%7 , we can write :
    * finalFortune = birthday.rem(fortunes.size)*/

     temp = fortunes[finalFortune]
    return temp
}