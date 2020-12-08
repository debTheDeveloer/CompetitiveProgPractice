import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashMapKey {
    public static void main(String[] args){
        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("Arka","Arka");
        hashmap.put("Debajyoti","Debajyoti");
        hashmap.put("Sayan","Sayan");
        hashmap.put("Pritam","Pritam");
        hashmap.put("Deep","Deep");
        System.out.println("Printing keys in unsorteed manner");
        for (Map.Entry<String,String> entry :hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }

        System.out.println("Printing keys in sprted manner");
        Map<String,String> treemap = new TreeMap<>(hashmap);
        for (Map.Entry<String,String> sortedEntry: treemap.entrySet()) {
            System.out.println(sortedEntry.getKey());
        }


    }

}
