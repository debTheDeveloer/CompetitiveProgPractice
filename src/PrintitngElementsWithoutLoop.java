public class PrintitngElementsWithoutLoop {
    public static void main(String[] args) {
        printNumberWithoutLoop(1);
    }

    private static void printNumberWithoutLoop(int i) {
        if (i <= 10) {
            System.out.println(i);
            printNumberWithoutLoop(i+1);
        }
    }
}