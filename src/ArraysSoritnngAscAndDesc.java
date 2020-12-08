import java.util.Arrays;
import java.util.Collections;

public class ArraysSoritnngAscAndDesc {
    public static void main(String[] args){
        Integer[] input = new Integer[]{1,4,6,7,3,2,0,5};
        System.out.println("Before Sorting...");
        for (int i:input) {
            System.out.println(i);
        }

        Arrays.sort(input);
        System.out.println("After sorting it in asscending manner");
        for (int i:input) {
            System.out.println(i);
        }

        Arrays.sort(input,Collections.reverseOrder());
        System.out.println("After descending order soriting");
        for (int i:input) {
            System.out.println(i);
        }
    }
}
