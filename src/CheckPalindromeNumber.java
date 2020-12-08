import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int givenNumber=sc.nextInt();
        int originalNumber=givenNumber;
        int reminder=0;
        int sum=0;

        while (givenNumber>0){
            reminder=givenNumber%10;
            sum=(sum*10)+reminder;
            givenNumber=givenNumber/10;
        }

        if(sum==originalNumber)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not palindrome");
        System.out.println(sum);
    }
}
