import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<50;i++){
            int val= ThreadLocalRandom.current().nextInt(0,1000);
            arr.add(val);
        }
        for(int i=0;i<50;i++)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        for(int i=0;i<25;i++){
            int rand=ThreadLocalRandom.current().nextInt(0,arr.size());
            arr.remove(rand);
        }

        for(int i:arr)
            System.out.print(i+" ");
    }

}

