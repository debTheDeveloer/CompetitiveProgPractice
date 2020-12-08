import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElementFromAnArray {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number");
        int index=sc.nextInt();
        int[] secondArray = new int[firstArray.length-1];

        for(int i=0,k=0;i<firstArray.length;i++){
            if(index==i)
                continue;

            secondArray[k]=firstArray[i];
            k++;
        }

        for (int i:secondArray) {
            System.out.println(i);
        }

    }
}
