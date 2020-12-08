import java.util.Scanner;

public class EachWordCharCountInAsentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String st = sc.nextLine();

        String[] allwords= st.split(" ");
        for (String s :allwords) {
            System.out.println("Character count for "+s+" is: "+s.length());
        }
    }
}
