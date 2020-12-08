import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int givenNumber=sc.nextInt();

        boolean prime=true;

        for(int i=2;i<(int)givenNumber/2;i++){
            if(givenNumber%i==0)
                prime=false;
        }

        if(prime)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }
}
