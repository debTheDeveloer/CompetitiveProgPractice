import java.util.Scanner;

public class CheckAnumberEvenOrOddWithoutUsingModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if((number/2)*2==number)
            System.out.println("The number is even");
        else
            System.out.println("Number is odd");
    }
}
