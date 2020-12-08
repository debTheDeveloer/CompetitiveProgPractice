import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerTrst {

        private static final int[] kDenominations = { 100, 50, 10, 5, 2, 1 };

        private static int solve(int n) {
            int result = 0;
            for (int i = 0; i < kDenominations.length; i = i + 1) {
                int d = kDenominations[i];
                if (n >= d) {
                    result = result + (n / d);
                    n = n % d;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            int t = scanner.nextInt();
            for (int i = 0; i < t; i = i + 1) {
                int n = scanner.nextInt();
                int result = solve(n);
                sb.append(result);
                sb.append("\n");
            }
            System.out.print(sb);
        }


    }