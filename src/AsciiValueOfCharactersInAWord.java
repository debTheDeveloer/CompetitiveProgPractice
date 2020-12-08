import java.util.Scanner;

public class AsciiValueOfCharactersInAWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.nextLine();
        char[] wrdChar = s.toCharArray();

        for (char c: wrdChar) {
            int i=c;
            System.out.println("Ascii value of: "+c+" is: "+i);
        }
    }
}
