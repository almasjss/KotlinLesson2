import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

//Work of @almasjss


//1. Find the value of the function y = 3x6 - 6x2 - 7 for a given value of x.
fun printFindTheValue(x: Double): Double {
    var cor: Double = x
    return 3 * (cor.pow(6)) - 6 * (cor.pow(2)) - 7
}

//2. Find the value of the function y = 4 (x − 3) 6 - 7 (x − 3) 3 + 2 for a given
//value x
fun printFindTheValueY(x: Int): Int {
    return 4 * (x - 3) * 6 - 7 * (x - 3) * 3 + 2
}
//3.The value of the angle α is given in degrees (0 <α <360). Determine the value of the same angle
//in radians, taking into account that 180◦ = π radians. As
//use π values 3.14.
fun findRadianForCircle(Value:Double): Double {
    //     val pi = 3.14159265359;
    return if(Value>0 && Value<360) {
        Math.toRadians(Value)
//        return (Value * (PI / 1800));
    }
    else{
        0.0
    }
}
//4. The value of the angle α is given in radians (0 <α <2 · π). Determine the value
//the same angle in degrees, considering that 180◦ = π radians. As
//use π values 3.14.
fun findDegreeForCircle(Value:Double):Double{
     val pi:Double = 3.14159;
    return(Value * (180/pi));

}

//5. The temperature T is given in degrees Fahrenheit. Define
//the value of the same temperature in degrees Celsius. Celsius temperature TC and Fahrenheit
//temperature TF are related as follows:
//TC = (TF - 32) 5/9.
fun printTF(f: Double): Double {
      return (( 5 *(f - 32.0)) / 9.0);
}

//6. The value of the temperature T is given in degrees Celsius. Determine the meaning
//reading the same temperature in degrees Fahrenheit. Celsius temperature TC and Fahrenheit
//temperature TF are related as follows:
//TC = (TF - 32) 5/9.
fun printTC(c: Double): Double {
   return (9.0/5.0)*c + 32;
}
//7. The speed of the boat in still water is V km / h, the speed of the river is U km / h (U <V). The
//time of boat movement on the lake is T1 h, and along the river (upstream) - T2 h. Determine the
//path S covered by the boat (path = time · speed). Take into account that when moving against the
//current, the boat speed decreases by the value of the current speed.
fun findPathOfBoat(V:Int,U:Int,T1:Int,T2:Int): Int {
    return V*T1+(V-U)*T2
}


//8. The speed of the first car is V1 km / h, the second - V2 km / h, the distance between them is S
//km. Determine the distance between them in T hours, if the cars move away from each other. This
//distance is equal to the sum of the initial distance and the total distance traveled by the vehicles;
//total path = time · total speed.
fun findTotalPath(V1:Int,V2:Int,S:Int,T:Int): Int {
    return S+V1*T+V2*T
}

//9. The speed of the first car is V1 km / h, the second - V2 km / h, the distance between them is S
//km. Determine the distance between them in T hours, if the cars initially move towards each other.
//This distance is equal to the modulus of the difference between the initial distance and the total
//distance traveled by the vehicles; total path = time · total speed.
fun findTotalPath2(V1:Int,V2:Int,S:Int,T:Int): Int {
    return abs(S-(V1*T+V2*T))
}

//10. Find the roots of the quadratic equation A · x2 + B · x + C = 0, given by its coefficients A, B, C
//(coefficient A is not equal to 0), if it is known that the discriminant of the equation is positive.
//Derive first the smaller and then the larger of the found roots. The roots of the quadratic equation
//are found by the formula
//x1, 2 = (−B ± √D) / (2 A), where D is the discriminant equal to B2 - 4 A C

fun findRoot(Val1:Double,Val2:Double,Val3:Double): String {
    val discriminant:Double = sqrt(Val2)-4*Val1*Val3
    val x1:Double=((-1)*Val2+sqrt(discriminant))/(2*Val1)
    val x2:Double=((-1)*Val2-sqrt(discriminant))/(2*Val1)
    if(x2<x1){
        val result1= "Smaller Root:$x2"
        val result2 = "Larger Root:$x1"
        return result1+result2
    }
    else{
        val result1 = "Smaller Root:$x1"
        val result2 = "Larger Root:$x2"
        return result1+result2
    }

}
fun main(){
    println("assignment 1,1:")
    println(".........................................")
    val numberText = readLine()!!
    var number:Int = numberText.toInt()
    println("Task1: Find the value of the function y = 3x6 - 6x2 - 7 for a given value of x.")
    println("Enter value of x:")
    var string0 = readLine()!!
    var Double0: Double = string0.toDouble()
    println("Task 2 :")
    println("Enter value for y:")
    var stringVal = readLine()!!
    var IntVal:Int = stringVal.toInt()
    println("Result:"+printFindTheValueY(IntVal))
    println("Answer="+printFindTheValue(Double0))
    println("Enter Degree of the Circle: (0-360)")
    var string1 = readLine()!!
    var DoubleA: Double = string1.toDouble()
    println("Radian="+findRadianForCircle(DoubleA))
    println("Enter Radian of the Circle: (0-2pi)")
    var string2 = readLine()!!
    var DoubleB: Double = string2.toDouble()
    println("Degree="+findRadianForCircle(DoubleB))
    println("Enter Fahrenheit value:")
    var string3 = readLine()!!
    var DoubleC: Double = string3.toDouble()
    println("Degree in Fahrenheit is equal"+(printTF(DoubleC))+" "+"Celsius")
    println("Enter Celsius value ")
    var string4 = readLine()!!
    var DoubleD: Double = string4.toDouble()
    println("Degree in Celsius is equal"+printTC(DoubleD)+" "+"Fahrenheit")

}