import java.util.Scanner;

public class SumOfTwoStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String number");
        String st1= sc.nextLine();
        System.out.println("Enter second String number");
        String st2= sc.nextLine();
        try {
          int  num1 = Integer.parseInt(st1);
          int  num2 = Integer.parseInt(st2);
          int sum = num1+num2;
            System.out.println("Sum is: "+sum);
        }catch (NumberFormatException n){
            System.out.println("Please enter a valid string which can be converted to Integer");
        }



    }
}
