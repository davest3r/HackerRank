import java.io.*;
import java.util.*;

public class Solution {

    public static void output(String s) {

        for(int i = 0; i < s.length(); i += 2) {
            System.out.printf("" + s.charAt(i));
        }

        System.out.printf(" ");

        for(int i = 1; i< s.length(); i += 2) {
            System.out.printf("" + s.charAt(i));
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
