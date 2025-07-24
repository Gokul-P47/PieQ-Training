import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        int[] arr=new int[50];
        for(int i=0;i<50;i++){
            int val= ThreadLocalRandom.current().nextInt(0,1000);
            arr[i]=val;
        }
        for(int i=0;i<50;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        HashSet<Integer> indxList=new HashSet<>();
        for(int i=0;i<25;i++){
            int rand=ThreadLocalRandom.current().nextInt(0,arr.length);
            indxList.add(rand);
        }
        int finalArr[]=new int[50-indxList.size()];
        int indx=0;
        for(int i=0;i<50;i++){
            if(indxList.contains(i)) continue;
            finalArr[indx++]=arr[i];
        }
        for(int i=0;i<finalArr.length;i++)
            System.out.print(finalArr[i]+" ");
    }

}

