//1. An integer is given. If it is positive, then add 1 to it; otherwise, do not change it. Print
//the received number.
fun checkPositiveNumber(numb: Int): Int {
    return if(numb >= 0) {
        numb + 1
    }
    else{
        numb
    }
}
//2. An integer is given. If it is positive, then add 1 to it; otherwise, subtract 2. Output the
//resulting number.
fun checkNumber(numb:Int): Int {
    return if(numb >= 0) {
        numb + 1
    }
    else{
        numb-2
    }
}
//3. Задано целое число. Если оно положительное, то добавьте к нему 1; если отрицательное, то вычтите из него 2; если
//ноль, то
//замените его на 10. Выведите полученное число.
//3. An integer is given. If it is positive, then add 1 to it; if negative, then subtract 2 from it; if
//zero, then
//replace it with 10. Print the resulting number.
fun checkNumber2(numb:Int): Int {
    return if(numb > 0) {
        numb + 1
    }
    else if(numb==0){
        var ans = numb+10
        numb
    }
    else{
        numb-2
    }
}
//4. Given the number of the year (positive integer). Determine the number of days in this
//year, given that a regular year has 365 days, and a leap year has 366 days. A leap year is
//a year that is divisible by 4, except for those years that are divisible by 100 and not
//divisible by 400 (for example, years 300, 1300 and 1900 are not leap years, but 1200 and
//2000
//- are).
//4. Задан номер года (целое положительное число). Определите количество дней в этом
//году, учитывая, что в обычном году 365 дней, а в високосном - 366 дней. Високосный год - это
// год, который делится на 4, за исключением тех лет, которые делятся на 100, а не
// делятся на 400 (например, 300, 1300 и 1900 годы не являются високосными годами, а 1200 и
//2000
//- являются).
fun checkYear(numb: Int): String {
    return if(((numb % 4 == 0 ) && (numb % 100!=0)) || (numb%400 == 0)){
        "Is leap year"
    }
    else {
        "Is not leap year"
    }
}

//5. An integer is given. Print its description string of the form "negative
//even number "," zero number "," positive odd number ", etc.
fun checkNumberTypes(numb: Int): String {
    return if (numb<0 && numb%2==0) {
        "Negative even number"
    }
    else if (numb==0){
        "Zero number"
    }
    else {
        "Positive odd number"
    }
}
//6. You are given an integer in the range 1–999. Print its line - a description of the form
//"even two-digit number", "odd three-digit number"
//etc.

fun checkNumbDescription(numb: Int): String {
    return if (numb in 2..999) {
        if (numb%2==0 && numb<100){
            "Even two-digit number"
        }
        else{
            "odd three-digit number"
        }
    }
    else{
        "Error!"
    }
}

fun main(){
//    println(checkPositiveNumber(1))
//    println(checkPositiveNumber(-1))
    println(checkYear(1900))
}