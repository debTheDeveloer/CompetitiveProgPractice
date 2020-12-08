import java.util.Scanner;

public class NumericalTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to display the table");
        int number = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+" ="+number*i);
        }
    }
}
