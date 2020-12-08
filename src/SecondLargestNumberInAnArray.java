import java.util.Arrays;

public class SecondLargestNumberInAnArray {
    public static void main(String[] args){
        int[] givenArray = new int[]{1,10,4,5,7,3};
        Arrays.sort(givenArray);
        System.out.println("Second Largest number is: "+givenArray[givenArray.length-2]);
    }
}
