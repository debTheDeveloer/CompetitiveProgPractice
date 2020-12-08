import java.util.Arrays;

public class LargestAndSmallestNumberInArray {
    public static void main(String[] args){
        int[] intArray = new int[]{2,3,1,4,9,5,7};
       /* Arrays.sort(intArray);
        System.out.println("Highest number of the array is: "+intArray[intArray.length-1]);
        System.out.println("Shortest number of the array is: "+intArray[0]);*/

       //Another way to deal it

        int smallestNumber=Integer.MAX_VALUE;
        int largestNumber=Integer.MIN_VALUE;

        for (int number:intArray) {
            if(number>largestNumber)
                largestNumber=number;
            if(number<smallestNumber)
                smallestNumber=number;
        }

        System.out.println("Largest Number is: "+largestNumber);
        System.out.println("Smallest Number is: "+smallestNumber);
    }
}
