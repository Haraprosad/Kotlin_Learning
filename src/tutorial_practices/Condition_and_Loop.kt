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

}