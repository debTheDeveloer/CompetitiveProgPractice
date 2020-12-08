import java.util.Arrays;

public class CalcuateLargestMultiplicationValueOfConsecutiveIndex {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int value = 1;
            for (int m = i; m < arr.length; m++) {
                value = value * arr[m];
                if (value > max)
                    max = value;
            }
        }
        System.out.println("Maxium product is: "+max);
    }
}
