public class ElementsAtEvenPosition {
    public static void main(String[] args){
        int[] arr = new int[]{12,13,14,15,16,17,18,19,20};
        printEvenPositionNumber(arr);
    }

    private static void printEvenPositionNumber(int[] arr) {
        for(int i=2;i<arr.length;i=i+2){
            System.out.println("Index of the element is: "+i+"......Elements value= "+arr[i]);
        }
    }
}
