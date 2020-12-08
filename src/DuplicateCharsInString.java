import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        String str = "abcddefghiiklmnopkk";
        char[] strArray = str.toCharArray();
        HashMap<Character,Integer> hashMapUnique = new HashMap<>();
        HashMap<Character,Integer> hashMapDuplicate = new HashMap<>();
        System.out.println("Duplicate Characters are: ");
        for (char c: strArray) {
            if(hashMapUnique.containsKey(c))
                hashMapDuplicate.put(c,1);
            else
                hashMapUnique.put(c,1);
        }

        System.out.println("Unique Chars are:");
        hashMapUnique.entrySet().stream().forEach(characterIntegerEntry -> System.out.print(characterIntegerEntry.getKey()+" "));
        System.out.println();
        System.out.println("Duplicate Chars are:");
        hashMapDuplicate.entrySet().stream().forEach(characterIntegerEntry -> System.out.print(characterIntegerEntry.getKey()+" "));
    }
}
