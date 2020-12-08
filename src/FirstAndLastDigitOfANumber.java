import java.util.Scanner;

public class FirstAndLastDigitOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int firstDigit=0;
        int lastDigit=number%10;
        while(number>0){
            firstDigit=number%10;
            number= number/10;
        }
        System.out.println("First Digit id: "+firstDigit);
        System.out.println("Last Digit id: "+lastDigit);
        System.out.println( lastDigit+firstDigit);
    }
}
