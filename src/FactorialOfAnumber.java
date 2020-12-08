import java.util.Scanner;

public class FactorialOfAnumber {
    static private int factorial =1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        calcualteFactorial(number);

       /* for(int i=number;i>0;i--)
            factorial=factorial*i;

        System.out.println("Factorail value is "+factorial);*/
        System.out.println("Factorial value is: "+factorial);
    }


    //Using recursion
    private static void calcualteFactorial(int number) {
        if(number>0){
            factorial=number*factorial;
            calcualteFactorial(number-1);
        }
    }
}
