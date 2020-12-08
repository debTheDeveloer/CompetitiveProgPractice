import java.util.ArrayList;
import java.util.Collections;

public class SwappingTwoElementsInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Arraylist is: "+al);

        Collections.swap(al,1,3);

        System.out.println("After swapping the list is: "+al);
    }
}
