import kotlin.math.PI
import kotlin.math.sqrt

//the tasks that I deleted I solved them in the last file in fundamentals.kt


//2. Given the legs of a right-angled triangle a and b.
// Find its hypotenuse c and perimeter P: √ 2 2c = a + b, P = a + b + c.
fun printHypotenuse(a: Int,b: Int,c: Int): Double {
    val sqrt = sqrt(2.0)
    return sqrt*c+a+b
}
fun printPerimeter(a:Int,b:Int,c:Int): Int {
    return a*b*c
}

//3. Two circles with a common center and radii R1 and R2 (R1> R2) are given.
//Find the areas of these circles S1 and S2, as well as the area S3 of the ring, the outer radius
// of which is equal
// to R1, and the inner radius is equal to R2:S1 = π (R1) 2, S2 = π (R2) 2, S3 = S1 - S2. Use 3.14 for π.
//S1 = π (R1) 2, S2 = π (R2) 2, S3 = S1 - S2. Use 3.14 for π.
fun printAreaOfCircle(){

}

//5. Given the area S of the circle. Find its diameter D and the length
// L of the circle bounding this circle, taking into account that L = 2 ·π· R, S = π· R2. Use 3.14 for π.
fun printLengthOfArea(R: Int): Double {
    return 2 * PI * R
}
fun printAreaOfCircleS(R: Int): Double {
    return PI*(R*R)
}


fun main(){

}