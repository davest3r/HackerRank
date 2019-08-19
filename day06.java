import java.io.*;
import java.util.*;

public class Solution {

    public static void output(String s) {
        char[] input = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            input[i] = s.charAt(i);
        }

        for(int i = 0; i < input.length; i += 2) {
            System.out.printf("" + input[i]);
        }

        System.out.printf(" ");

        for(int i = 1; i< input.length; i += 2) {
            System.out.printf("" + input[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        String[] S = new String[T];

        for(int i = 0; i < T; i++) {
            S[i] = scan.nextLine();
            output(S[i]);
        }

        scan.close();
    }
}
