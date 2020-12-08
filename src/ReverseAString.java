import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();

        //Process 1
       /* char[] newString= new char[st.length()];

        for(int i=0;i<st.length();i++){
            newString[i]=st.charAt(st.length()-1-i);
        }

        for (char c: newString) {
            System.out.print(c);
        }*/


       //Process: 2 , Recursive
        System.out.println(reverseString(st));
    }

    private static String reverseString(String st) {
        if(st.length()<=1 || st==null)
            return st;
       return reverseString(st.substring(1))+st.charAt(0);
    }
}
