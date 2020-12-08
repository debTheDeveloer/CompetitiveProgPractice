import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter Second number");
        int n2=sc.nextInt();

        System.out.println("Before changing the values are :"+"n1: "+n1+" n2: "+n2);

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("After changing the values are :"+"n1: "+n1+" n2: "+n2);
    }
}
