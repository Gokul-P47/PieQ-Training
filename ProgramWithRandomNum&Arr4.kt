import kotlin.random.Random
fun main(){
        var arr=IntArray(50)
        for (i in 0 until 50) {
        	val value = Random.nextInt(0, 1000)
        	arr[i] = value
        }
    	for (i in 0 until arr.size) {
        	print("${arr[i]} ")
    	}
    	println();
    	println("Random Number generated :")
        val set = HashSet<Int>() 
    	for (i in 0 until 25) {
        	val rand = Random.nextInt(0, arr.size)
        	print("${rand} ")
        	set.add(rand)
    	}
        var ans=IntArray(50-set.size)
        var indx=0
    	println()
    	for (i in 0 until arr.size) {
       	 	if(set.contains(i))	continue;
            ans[indx++]=arr[i];
    	}
        println("Final arr :")
        for(i in 0 until ans.size)
        	print("${ans[i]} ")
}
