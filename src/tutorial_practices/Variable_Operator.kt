package tutorial_practices

fun main(args: Array<String>){
    /*data types ->majorly 2 types a)mutable(var) b)immutable(val)
    var type variable's value can be changed bur val type variable's value can not
    be changed (it is like final keyword of java)
    Besides,Object data type(Integer,Long,String etc.) is available
    .declaration system like :var/val variableName:dataType = value.*/
    val a = 5
    val b:Int = 7 //best practice

    //b = 8 not possible, a = 8 possible

    //Use of for loop for n times
    for(i in 0..49){  //here 0 to 49 , n=50
        print("$i,")  //to stay in same line
    }
    println("")

    //Use of When loop. It is almost same as ..switch.. statement

    when(a){
        1-> println("You are First")
        2->println("you are second")
        5->println("you are fifth")
        else -> println("a not equal to 1,2,5")
    }

    //Range operation in kotlin

    //.. operator can be used for storing range element in a variable(like array)
    var range = 1..10
    //for every element what will be performed is determined by v_name.forEach{action}
    range.forEach{print("$it ")} //'it'  expresses  every element  each time
    var n = 0
    range.forEach{n=n+it}

    println("\nsummation from 1 to 10 is: $n")

    println("\nReversed:")
    range.reversed().forEach{print("$it ")}

    println("\n1 to 40 ->step 4:")
    var rangeTwo = 1..40 step 4
    rangeTwo.forEach{print("$it ")}

    println("By using downTo method for 10 to 1 :")

    var rangeReverse = 10.downTo(1)
     rangeReverse.forEach {"$it " }


    println("Use of untill method from 10 until 20 :")

    var rangeUntil = 10.until(20)
    rangeUntil.forEach {print("$it ") }

}