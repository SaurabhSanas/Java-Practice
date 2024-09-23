import java.util.*;


public class LinkedListOperations {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        /*System.out.println(search(k));*/

        /*addAtEnd(k);
        int index = s.nextInt();

        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }*/
        String str = "Saurabh";System.out.println(str);
        str = str + " ";System.out.println(str);
        str = str + "Sanas";
        System.out.println(str);
        System.out.println("Saurabh Sanas is Great");
    }

    // Method to search for k in the given LinkedList
    static boolean search(int k) {
        // Write your code here
        boolean b = false;
        Node node = head;
        do{
            if(node.data == k){
                b = true;
                return b;
            }
            node = node.next;
        }while(node.next != null);
        return b;
    }

    static void addAtEnd(int k) {
        // Write your code here
        if(head == null){
            head = new Node(k);
            return;
        }
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node(k);
    }

    static void addAtGivenIndex(int k, int index) {
        // Write your code here
        Node temp = new Node(k);
        /*for(int i = 0; i <= k; i++){
            if(node == null){
                node = new Node(index);
                return;
            }
            node = node.next;
        }
        Node temp = new Node(index);
        temp.next = node.next;
        node.next = temp;*/

        if (head == null) {
            head = temp;
        }else if(index == 0){
            temp.next = head;
            head = temp;
        }else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                if (node.next == null) {
                    node.next = new Node(k);
                    return;
                }
                node = node.next;
            }
            temp.next = node.next;
            node.next = temp;
        }
    }
}
