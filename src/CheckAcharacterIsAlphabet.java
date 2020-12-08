import java.util.Scanner;

public class CheckAcharacterIsAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c=sc.nextLine().charAt(0);
        if(c>='a' && c<='z' || c>='A' && c<='Z')
            System.out.println("The character is an alphabet");
        else
            System.out.println("The character is not an alphabet");
    }
}
