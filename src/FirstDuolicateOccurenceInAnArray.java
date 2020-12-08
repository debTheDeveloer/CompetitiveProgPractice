public class FirstDuolicateOccurenceInAnArray {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4,1};
        int count=0;
        parent:
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println("First Duplicate number is :" + num[i]);
                    count++;
                    break parent;
                }
            }
        }
        if(count==0)
            System.out.println("There is not a single duplicate element in the array");
    }
}
