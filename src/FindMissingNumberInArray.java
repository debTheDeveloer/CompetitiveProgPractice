import java.util.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,6}; //Missing number is 5
        int expectedLength=6;
        int expectedSum=((expectedLength*(expectedLength+1))/2);
        int originalSum=0;
        for (int i: input) {
            originalSum=originalSum+i;
        }

        int missingNumber = expectedSum-originalSum;
        System.out.println("Missing element is: "+missingNumber);
    }
}
