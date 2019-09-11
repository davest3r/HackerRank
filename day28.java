import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Node {
    private String firstName;
    private String emailID;

    public Node(String firstName, String emailID) {
        this.firstName = firstName;
        this.emailID = emailID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailID() {
        return emailID;
    }
}

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void sortFirstName(LinkedList<Node> list) {

        for(int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j).getFirstName().compareTo(list.get(min).getFirstName()) < 0) {
                    min = j;
                }
            }
            Node temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Node> list = new LinkedList<Node>();

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            list.add(new Node(firstName, emailID));
        }

        scanner.close();

        sortFirstName(list);

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getEmailID().contains("@gmail.com")) {
                System.out.println(list.get(i).getFirstName());
            }
        }
    }
}
