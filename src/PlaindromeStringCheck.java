import java.util.Scanner;

public class PlaindromeStringCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine().toLowerCase();
        int checkLimit=(int) input.length()/2;  // We need to check only till middle char of the string
        boolean result = true;

        for(int i=0;i<checkLimit;i++){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
                result = false;
            }
        }
        System.out.println(result);
    }
}
