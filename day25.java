import java.io.*;
import java.util.*;

public class Solution {

    public static String prime(int n) {

        if(n == 1) {
            return "Not prime";
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0 && n != i) {
                return "Not prime";
            }
        }

        return "Prime";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println(prime(scanner.nextInt()));
        }

        scanner.close();
    }
}
