import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonElementInTwoArraysAmongThreeArrays {
    public static void main(String[] args) {
        Integer[] firstArray=new Integer[]{1,2,3,4,5,6};
        Integer[] secondArray=new Integer[]{3,4};
        Integer[] thirdArray=new Integer[]{7,8,2,3,4,6};

        List<Integer> al1 = Arrays.asList(firstArray);
        List<Integer> al2 = Arrays.asList(secondArray);
        List<Integer> al3 = Arrays.asList(thirdArray);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(al1);
        hashSet.addAll(al2);
        hashSet.addAll(al3);

        ArrayList<Integer> newArrayList = new ArrayList<>();

        System.out.println(hashSet);

        for (int i:hashSet) {
            if((al1.contains(i)&&al2.contains(i))
                || (al2.contains(i)&&al3.contains(i))
                    ||(al3.contains(i)&&al1.contains(i)))
                newArrayList.add(i);

        }

        System.out.println("New ArrayList is: "+newArrayList);
    }
}
