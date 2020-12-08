import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sqrOf=0;
        for(int i=1;i<number;i++){
            if(i*i>number) {
                System.out.println("The given numbr is not perfect square");
                System.out.println(i);
                return;
            }
            if(i*i==number){
                sqrOf=i;
                System.out.println("The number is a perfect square of "+sqrOf);
                return;
            }

        }
    }
}
