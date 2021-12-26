fun main(){
    var massWeight1 = 60
    var massWeight2 = 70
    if(massWeight1 > massWeight2){
        println("first person")
    }
    else{
        println("second person")
    }
    //2
    var mass1 = 0
    var mass2 = 0
    if(mass1 > mass2){
        println("first person")
    }
    else if(mass1 == mass2){
        println("they are equal")
    }
    else {
        println("second person")
    }
    //3
    val age = 20
    if(age >= 7){
        println("you ay go school")
    }else if(age>=18){
        println("you can drive")
    }
    else if(age>63){
        println("happy retirement")
    }
    //4 one line
    val age1 = 18
    if(age >=10){
        println("you can go to college")
    }
    // 5 other data types
    var name = "Tom"
    if(name == "Tom"){
        println("Welcome home")
    }else{
        println("who are you?")
    }
    //6
    var isRainy = true
    if(isRainy)
        println("its rainy")
    //6 WHEN Expressions
    var season = 3
    when(season){
        1-> println("spring")
        2-> println("summer")
        //multiline code
        3->{
            println("Fall")
            println("Autumn")
        }
        4-> println("winter")
        else -> println("invalid season")
    }
    //7
    var mouth =3
    when(mouth){
        in 3..5-> println("spring")
        in 6..8-> println("summer")
        in 9..11-> println("fall")
        //12..2
        //12 dowTo 2
        12,1,2, -> println("winter")
        else -> println("invalid season")
    }
    //8
    //lets rebuild 3 statement
    var temperature = 100
    when(temperature){
        !in -5..5-> println("not confident")
        in 10..15 -> println("warm")
        in 30..40-> println("hot")
    }
    //9
    var x: Any =30.4
    when(x){
        is Int-> println("x is an int")
        is Double-> println(" x is a double")
        is String -> println("x is a string")

        else -> println("non of them")
    }
    //10 While loop
    var q=1
    while(q<=10){
        println("$q")
        q++
    }
    println("\n while loop is done")
    //11
    var a =100
    while(a>=0){
        println("$a")
        a-=2
    }
    println("while done")
    //12
    a=1
    do{
        a++
        print("$a")
    }while(a<=10)
    println("while do")
}