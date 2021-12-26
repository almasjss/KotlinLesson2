import java.util.*

//1. Given an integer greater than 999. Using one integer division and one modulo
//operation, find the digit corresponding to the thousandth place in the record of this
//number. Дано целое число, большее 999. Используя одно целое деление и одну
//операцию по модулю, найдите цифру, соответствующую тысячному месту в записи этого
//числа.


fun findDigitNumb(Value:Int): Int {
    return ((Value.mod(10000).div(1000)))
}



//2. Since the beginning of the day, N seconds have passed (N is an integer). Find the
//number of full minutes that have passed since the beginning of the day.
//2. С начала дня прошло N секунд (N - целое число). Найдите
//количество полных минут, прошедших с начала дня.
fun findNMinute() {
    val minut: Int
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    minut = N/60
    println(minut)
}


//3.N seconds have passed since the beginning of the day (N is an integer). Find the
//number of complete hours that have passed since the beginning of the day.

fun findNumberofComplete(){
    val hours: Int
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    hours = N/3600
    println(hours)
}
//4.N seconds have passed since the beginning of the day (N is an integer). Find the
//number of seconds elapsed since the beginning of the last minute.
fun ta(){
    val seconds: Int
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    seconds =  N % 60
    println(seconds)}

//5.N seconds have passed since the beginning of the day (N is an integer). Find the
//number of seconds since the beginning of the last hour.
fun findLastHour1(){
    val seconds: Int
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    seconds = N % 3600
    println(seconds)
}

//6.N seconds have passed since the beginning of the day (N is an integer). Find the
//number of full minutes that have passed since the beginning of the last hour.
fun  findLastHour(){
    val minutes: Int
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    minutes = N%3600/60
    println(minutes)
}

//7. Days of the week are numbered as follows: 0 - Sunday, 1 - Monday, 2 - Tuesday, ..., 6 -
//Saturday. You are given an integer K in the range 1–365. Determine the number of the day
//of the week for the K-th day of the year, if it is known that this year January 1 was
//Monday.
fun findNday0(){
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    println(((N + 0)%7))
}

//8. Days of the week are numbered as follows: 0 - Sunday, 1 - Monday, 2 - Tuesday, ..., 6 -
//Saturday. You are given an integer K in the range 1–365. Determine the number of the day
//of the week for the K-th day of the year, if it is known that this year January 1 was
//Thursday.
fun findNday(){
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    println((N + 3)%7)
}

//9. Days of the week are numbered as follows: 1 - Monday, 2 - Tuesday,. ... ... , 6 -
//Saturday, 7 - Sunday. You are given an integer K in the range 1–365. Determine the
//number of the day of the week for the K-th day of the year, if it is known that this year
//January 1 was Tuesday.
fun findNday2(){
    val scanner = Scanner(System.`in`)
    val N: Int = scanner.nextInt()
    println((N%7)+1)
}
fun main(){

}