import HelpingClass.MyComparator;

import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number");
        int num3 = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(num1);
        al.add(num2);
        al.add(num3);

       /* Collections.sort(al,new MyComparator());
        System.out.println("Largest number is: "+al.get(0));*/

        Collections.sort(al,(i1,i2)->i2.compareTo(i1));
        System.out.println("Largest number is: "+al.get(0));
        System.out.println(al);

/*
        Comparator<Integer> c= (i1,i2)->i2.compareTo(i1);
        Collections.sort(al,c);
       // Collections.sort(al,(i1,i2)->i2.compareTo(i1));*/  //SortCut


        //Another way to deal with
      //  max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

    }
}
