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
        for(int i=0;i<25;i++){
            int rand=ThreadLocalRandom.current().nextInt(0,arr.length);
            int[] tempArr=new int[arr.length-1];
            int idx=0;
            for(int j=0;j<arr.length;j++){
                if(rand==j) continue;
                tempArr[idx++]=arr[j];
            }
            arr=tempArr;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

}

