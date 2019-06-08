package tutorial_practices

import java.util.*

// To declare function ...fun.... keyword is used. if fun is only used-
//then the return type will be void and access modifier will be public.
// In ...()... args ->variable name, Array<String>-- Data type


fun main(args:Array<String>){

    //Simply getting output by .. println()...
    println("Simple println output..")

    var a = 5
    var b = 6

    // In kotlin following two types catennation is possible and output is same.
    println("the summation of "+a+" and "+b+" is: "+(a+b))
    println("the summation of $a and $b is: ${a+b}")
    println ("Enter your name:")

    //getting input from keyboard. input is taken as String
    var name = readLine()
    println("Your name is $name")

    println ("Enter your number:")

    //getting integer input
    var nameTwo = Integer.parseInt(readLine())
     println(" 5 add, then ${nameTwo+5}")


    println("Scanner input :")

    //getting input by using scanner

    var sc = Scanner(System.`in`)
    var nameThree = sc.nextLine()
    println("Your Scanner input is $nameThree")
    println("Input a number:")
    var number = sc.nextInt()
    println("Your Scanner input for int: $number")



}