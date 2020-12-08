import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String st1 = sc.nextLine();
        System.out.println("Enter the second String");
        String st2 = sc.nextLine();

        char[] firstArray = st1.toCharArray();
        char[] secondArrray = st2.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArrray);

        if(Arrays.equals(secondArrray,firstArray))
            System.out.println("Both the Strings are anagram");
        else
            System.out.println("Strings are not Anagram");
    }
}
