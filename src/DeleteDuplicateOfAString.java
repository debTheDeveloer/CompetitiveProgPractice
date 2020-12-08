import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicateOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        Set<Character> hashset = new HashSet<>();
        String unique = "";
        String duplicateElement="";
        for (int i = 0; i < str.length(); i++) {
            if (!hashset.contains(str.charAt(i))){
                hashset.add(str.charAt(i));
                unique=unique+str.charAt(i);
            }
            else{
                duplicateElement=duplicateElement+str.charAt(i)+" ";
            }
        }

        System.out.println("Unique string is:"+unique);
        System.out.println("Duplicate elements are: "+duplicateElement);
    }
}
