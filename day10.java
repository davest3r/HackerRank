import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int r = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();

        while(n != 0) {
            r = n % 2;
            n = n / 2;
            list.add(r);
        }

        int max = 0;
        int counter = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 1) {
                counter++;
            } else {
                if(counter > max) {
                    max = counter;
                }
                counter = 0;
            }
        }

        if(counter > max) {
            max = counter;
        }

        System.out.println(max);
    }
}
