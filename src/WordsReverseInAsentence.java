import java.util.Scanner;

public class WordsReverseInAsentence {
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String givenString = sc.nextLine();
        int j=0;

        String[] str= givenString.split(" ");
        String[] revString = new String[str.length];
        for(int i=str.length-1;i>=0;i--){
            revString[j]=str[i];
            j++;
        }
        for (String s: revString) {
            System.out.print(s+ " ");
        }
    }
}
