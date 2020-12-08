import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci series");
        int length=sc.nextInt();
        int n1=0;
        int n2=1;

        for(int i=0;i<length;i++){
//            System.out.print(n1+" ");
//            System.out.println(n1);
            System.out.println(n1);
            int sum=n1+n2;
            n1=n2;
            n2=sum;

        }

    }
}
