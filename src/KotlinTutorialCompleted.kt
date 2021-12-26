fun main(){
    println("Hello World!")

    //Example pf kotlin readability

    val myList = listOf(42,91,51)
    myList.get(myList.size-1)
    myList[myList.size-1]
    myList[myList.lastIndex]
    myList.last()

    //Type interface
    val first: String = "Almas"
    val last ="Jss"
    var age:Int
    age=22
    val friends = listOf("Jandos","Tamerlan")

    //Immutability
    //first +="t" - not allowed
    age+=1
    val otherFriends = mutableListOf("Maks","Andrei")
    otherFriends[0]="Aldiyar"

    // Null safety
    findFriendScore(friends)
    findFriendScore(null)

    // Extension function
    println(myList.secondToLast())
    println(friends.secondToLast())
}

/**
 * Compute the total length of all strings in the list
 */
fun findFriendScore(friends: List<String>?): Int? {
    // friends.size
    if (friends == null) {
        return null
    }
    var score = 0
    for (friend in friends) {
        score += friend.length
    }
    println(score)
    val score2 = friends.sumBy { friend -> friend.length }
    println(score2)
    return score
}

// Extension functions
fun <T> List<T>.secondToLast(): T? {
    if (this.size < 2) {
        return null
    }
    return this[this.size - 2]
}
