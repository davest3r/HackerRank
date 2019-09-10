import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int dayA = scanner.nextInt();
        int monthA = scanner.nextInt();
        int yearA = scanner.nextInt();

        int dayE = scanner.nextInt();
        int monthE = scanner.nextInt();
        int yearE = scanner.nextInt();
        scanner.close();

        if(dayA - dayE > 0 && monthA == monthE && yearA == yearE) {
            System.out.println((dayA - dayE) * 15);
        } else if(monthA - monthE > 0 && yearA == yearE) {
            System.out.println((monthA - monthE) * 500) ;
        } else if(yearA - yearE > 0) {
            System.out.println("10000");
        } else {
            System.out.println("0");
        }
    }
}
