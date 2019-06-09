package tutorial_practices

fun main(args: Array<String>){

    var a:Int = 13

    //General format

    if(a>18){
        println("You are adult")
    }
    else if(a>=13 && a<=18){
        println("You are teenager")
    }
    else{
        println("You are child.")
    }

    //Kotlin extra-ordinary format
      println("kotlin extra ordinary format:")
    var result = if(a>18) "adult" else if(a>=13 && a<=18)"teenager" else "child"
    println("You are $result.")


    /*kotlin nice format for .for.
    i takes each value from 0 to 9(increement for per loop is 1)
     and search is it in 0..9 range and if
    it is then action will be performed*/
     for(i in 0..9){

        println("i in 0..9 : $i")
    }

    // increement more by adding step keyword

    for(i in 0..9 step 2){
        println("i in 0..9 step 2: $i")
    }
    // array case for .for.

    var ar = arrayOf(1,2,3,4,5) //like ar = 1..5
    for(i in ar){
        println("i in array : $i") //i takes arrays elements value one by one
    }

    //for getting index of array
     for(i in ar.indices){ //i takes every index one by one
         println("index is $i and value is ${ar[i]}")
     }

}