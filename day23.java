import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = new LinkedList<Node>();
        Node temp;

        queue.add(root);
        while(queue.isEmpty() == false) {
            temp = queue.remove();
            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
            System.out.printf(temp.data + " ");
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        } else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            } else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}
