import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String givenString = sc.nextLine();
        int count=0;

        Set<Character> hashset = new HashSet<>();
        hashset.add('a');
        hashset.add('e');
        hashset.add('i');
        hashset.add('o');
        hashset.add('u');

        for(int i=0;i<givenString.length();i++){
            if(hashset.contains(givenString.charAt(i)))
                count++;
        }

        System.out.println("Total number of character is: "+count);
    }
}
