import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string..");
        String s = sc.nextLine();
        LinkedHashMap<Character, Integer> linkedhashMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            linkedhashMap.put(c, linkedhashMap.containsKey(c) ? linkedhashMap.get(c) + 1 : 1);
        }
        System.out.println(linkedhashMap);

        for (Map.Entry<Character, Integer> entry : linkedhashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non repeating character is: " + entry.getKey());
                return;
            }

        }
        System.out.println("All the characters are duplicate");

    }
}
