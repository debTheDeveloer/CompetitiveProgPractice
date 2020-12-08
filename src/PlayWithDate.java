import java.util.Date;

public class PlayWithDate {

    public static void main(String[] args) {
        Date  date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getTime()+300000);
        date.setTime(date.getTime()+300000);
        System.out.println(date);
    }
}
