import java.util.Scanner;

public class CountNumberOfDigitInNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int count=0;
        int number = sc.nextInt();
        while (number>0){
            number=number/10;
            count++;
        }
        System.out.println("Number of digits are: "+count);

    }
}
