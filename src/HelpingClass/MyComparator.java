package HelpingClass;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Integer i1 = (Integer)o;
        Integer i2 = (Integer)t1;

       return i2.compareTo(i1);
    }
}
