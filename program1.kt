import kotlin.random.Random
fun main() {
    var arr = IntArray(50)
    for (i in 0 until 50) {
        val value = Random.nextInt(0, 1000)
        arr[i] = value
    }
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
    println()
    for (i in 0 until 25) {
        val rand = Random.nextInt(0, arr.size)
        val tempArr = IntArray(arr.size - 1)
        var idx = 0
        for (j in 0 until arr.size) {
            if (j == rand) continue
            tempArr[idx++] = arr[j]
        }
        arr = tempArr
    }

    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
}
