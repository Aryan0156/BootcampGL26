import java.util.Scanner;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int data) {
        this.data = data;
    }
}

public class sorted {

    static DLLNode head = null;

    static void insert(int data) {
        DLLNode newNode = new DLLNode(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        DLLNode last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    static void removeDuplicates() {
        if (head == null || head.next == head)
            return;

        DLLNode curr = head;

        while (curr.next != head) {

            if (curr.data == curr.next.data) {

                DLLNode dup = curr.next;

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

        DLLNode temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if (data == -1) {
                break;
            } else {
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