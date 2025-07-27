import kotlin.random.Random

fun main() {
    val arr = mutableListOf<Int>()
    for (i in 0 until 50) {
        arr.add(Random.nextInt(1, 1000))
    }
    println("Initial List:")
    println(arr.joinToString(" "))

    println("Enter the number of elements to remove:")
    val n = readln().toInt()
    val toRemoveList= mutableListOf<Int>()
    println("Enter $n numbers :")
    for(i in 0 until n){
        toRemoveList.add(readln().toInt())
    }
    for (num in toRemoveList) {
        arr.remove(num)
    }
    println("Final List after removal:")
    println(arr.joinToString(" "))
}
