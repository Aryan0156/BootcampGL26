import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class sorted {

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    static void removeDuplicates() {
        if (head == null || head.next == head)
            return;

        Node curr = head;

        while (curr.next != head) {

            if (curr.data == curr.next.data) {

                Node dup = curr.next;

                curr.next = dup.next;
                dup.next.prev = curr;

            } else {
                curr = curr.next;
            }
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        while(true){
            int data = sc.nextInt();
            if(data == -1){
                break;

            }
            else{
                insert(data);
            }
        }

        System.out.println("Before removing duplicates:");
        display();

        removeDuplicates();

        System.out.println("After removing duplicates:");
        display();
        sc.close();
    }
} 
    
