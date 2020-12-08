import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(6);
        al.add(2);

        System.out.println("Before reversing the arraylist is: "+al);

        Collections.reverse(al);

        System.out.println("After reversing the arraylist is: "+al);
    }
}
