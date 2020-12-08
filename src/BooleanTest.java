import java.util.ArrayList;

public class BooleanTest {

    public static void main(String[] args) {
        Boolean b1 = new Boolean(Boolean.TRUE);
        Boolean b = new Boolean(Boolean.TRUE);
        boolean b2 = true;
        System.out.println(b);
        System.out.println(b1.equals(b));
        ArrayList al = new ArrayList();
        String s = "";
        al.add("Arka");
        System.out.println(!al.isEmpty());
        System.out.println(s.isEmpty());
    }
}
