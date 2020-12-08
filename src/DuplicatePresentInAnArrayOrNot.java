import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatePresentInAnArrayOrNot {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,1,5,8};// If we use int here we will not get proper o/p.
        List al = Arrays.asList(intArray);
        Set hashset = new HashSet(al);
        System.out.println(al);
        System.out.println(hashset);
            if(al.size()!=hashset.size())
                System.out.println("Array contains duplicate elements");
            else
                System.out.println("Array does not contain duplicate elements");

    }
}
