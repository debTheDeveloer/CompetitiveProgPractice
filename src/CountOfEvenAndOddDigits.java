import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class CountOfEvenAndOddDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        int evenCount=0;
        int oddCount=0;

        while(number>0){
            int temp=number%10;
            if(temp%2==0 || temp==0)
                evenCount++;
            if(temp%2!=0)
                oddCount++;
            number=number/10;
        }

        System.out.println("Count of Even number: "+evenCount);
        System.out.println("Count of Odd number: "+oddCount);
    }
}
