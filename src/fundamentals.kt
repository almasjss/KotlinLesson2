import java.lang.Math.PI

//     1. Given the side of the square a. Find its perimeter P = 4 · a.
fun printPerimeterSquare(a: Int):Int{
    return 4*a
}
//     2. Given the side of the square a. Find its area S = a2.
fun printSquare(a: Int):Int{
    return a*2
}
//      Given the sides of the rectangle a and b. Find its area S = a b andperimeter P = 2 (a + b).
fun printPerimeterRectangle(a: Int,b: Int):Int{
    return 2*(a+b)
}
fun printSquareRectangle(a: Int,b: Int):Int{
    return a*b
}
//      Given the diameter of the circle d. Find its length L = π · d. Asuse π values3.14.
fun printLengthOfCircle(d: Int): Double {
    return PI*d;
}
//      5. Given the length of the edge of the cube a. Find the volume of a cube V = a3 and its areasurface S = 6 a2.
fun printVolumeOfCube(a: Int): Int {
    return a*a*a

}
fun printAreaOfSurface(a: Int): Int {
    return 6*(a*a)
}
//      6. Given the lengths of the edges a, b, c of a rectangular parallelepiped. Findits volume V = a b c and surface area S = 2 (a b + b c + a c).
fun printVolumeOfParallelepiped(a: Int,b: Int,c: Int ): Int {
    return a*b*c
}
//S = 2 (a b + b c + a c).
fun printAreaOfParallelepiped(a: Int,b: Int,c: Int ): Int {
    return 2*(a*b+b*c+a*c)
}
// 7. Find the length of a circle L and the area ofa circle S of a given radius R:L = 2 π R, S = π R2. Use 3.14 for π
fun printLengthOfCircleL(r: Int): Double {
    return 2* PI*r
}
fun printAreaOfCircle(r: Int): Double {
    return PI*(r*r)
}
//8. Given two numbers a and b. Find their arithmetic mean: (a + b) / 2.
fun printArithmeticMean(a: Int,b: Int): Int {
    return (a+b)/2
}
//9. Given two non-negative numbers a and b. Find their geometric mean√ a · b.
fun printGeometricMean(a: Int,b: Int): Int {
    return a*b
}
//10. Two nonzero numbers are given. Find the sum, difference, product and the quotient of their squares.
fun find(a: Int,b: Int,c: String): Int {
    when {
        c.contains("sum") -> {
            return a+b;
        }
        c.contains("difference") -> {
            return a/b;
        }
        c.contains("product") -> {
            return a*b;
        }
        else -> {
            return a%b;
        }
    }
}
fun main(){
    println("........................")
    println("Fundamentals of Kotlin")
    println("Choose figure to calculate: ")
    println("1:Square (Perimeter and Squares)")
    println("2:Circle (length)")
    println("3:Rectangle (Perimeter and Square)")
    println("4: Cube : ")
    println("5: Parallelepiped :")
    println("6:Circle (length)")
    println("7: Arithmetic mean: ")
    println("8: Geometric mean: ")
    println("9: Two nonzero elements sum,difference,product,quotient")
    println(".............................")
    var option = readLine()!!
    var integerOption: Int = option.toInt()
    if (integerOption  == 1){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Your value: a ="+integerA)
        println("Square (S)="+" "+printSquare(integerA))
        println("Perimeter (P)"+" "+printPerimeterSquare(integerA))

    }
    else if (integerOption  == 2){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Your value: a ="+integerA)
        println("Length of circle (L)="+" "+printLengthOfCircle(integerA))

    }
    else if (integerOption  == 3){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Enter integer value b:")
        var string2 = readLine()!!
        var integerB : Int = string2.toInt()
        println("Your values: a ="+integerA +" "+"and b="+" "+integerB)
        println("Perimeter of Rectangle and Square:"+"P="+" "+ printPerimeterRectangle(integerA,integerB)+" S="+" "+printSquareRectangle(integerA,integerB) )

    }
    else if (integerOption  == 4){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Your value: a ="+integerA)
        println("Cube (V-Volume)="+" "+printVolumeOfCube(integerA)+" "+"Surface="+printAreaOfSurface(integerA))

    }
    else if (integerOption  == 5){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Enter integer value b:")
        var string2 = readLine()!!
        var integerB: Int = string2.toInt()
        println("Enter integer value c:")
        var string3 = readLine()!!
        var integerC: Int = string3.toInt()
        println("Your value: a ="+integerA+" "+"b="+integerB+" "+"c="+integerC)
        println("Volume Of Parallelepiped="+" "+printVolumeOfParallelepiped(integerA,integerB,integerC)+" "+"Are of parallelepiped"+printAreaOfParallelepiped(integerA,integerB,integerC))
    }
    else if (integerOption  == 6){
        println("Enter integer value radius:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Your radius: R ="+integerA)
        println("Length="+" "+printLengthOfCircleL(integerA) + printAreaOfCircle(integerA))
    }
    else if (integerOption  == 7){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Enter integer value b:")
        var string2 = readLine()!!
        var integerB: Int = string2.toInt()
        println("Your values: a =" + integerA + " " + "and b=" + " " + integerB)
        println("Arithmetic Means for values a and b="+" "+printArithmeticMean(integerA,integerB))
    }
    else if (integerOption  == 8){
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Enter integer value b:")
        var string2 = readLine()!!
        var integerB: Int = string2.toInt()
        println("Your values: a =" + integerA + " " + "and b=" + " " + integerB)
        println("Geometric Means for values a and b ="+" "+printGeometricMean(integerA,integerB))
    }
    else if (integerOption  == 9) {
        println("Enter integer value a:")
        var string1 = readLine()!!
        var integerA: Int = string1.toInt()
        println("Enter integer value b:")
        var string2 = readLine()!!
        var integerB: Int = string2.toInt()
        println("Your values: a =" + integerA + " " + "and b=" + " " + integerB)
        println("Write operation for values: (sum , diffrence, product ,quotient)")
        var c = readLine()!!
        if (integerA <= 0 || integerB <= 0) {
            println("Please write value data for a or b")
            println("Enter integer value a:")
            var string1 = readLine()!!
            var integerA: Int = string1.toInt()
            println("Enter integer value b:")
            var string2 = readLine()!!
            var integerB: Int = string2.toInt()
            println("Your values: a =" + integerA + " " + "and b=" + " " + integerB)
            println("Write operation for values: (sum , diffrence, product ,quotient)")
            var c = readLine()!!
            find(integerA,integerB,c)

        }
        else{
            find(integerA,integerB,c)
        }
    }

}