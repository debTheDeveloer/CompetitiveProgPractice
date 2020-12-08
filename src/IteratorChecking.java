import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorChecking {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        al.removeIf(integer -> integer == 5);

        System.out.println(al);

        //THIS PIECE OF CODE WILL THROW EXCEPTION AS ARRAYLIST OBJECT HAS BEEN USED INSTEAD OF ITERATOR OBJECT.
        /*while (itr.hasNext()){
            if(itr.next()==5)
                al.remove(4);
        }

        System.out.println(al);*/

        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next()==3)
                listIterator.add(9);
        }
        System.out.println(al);
    }

}
