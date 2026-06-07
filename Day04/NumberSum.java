import java.util.Scanner;

public class NumberSum {

    static class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static node head = null;

    static void insert(int data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            head.next = head;
            head.prev = head;
            return;
        }

        node last = head.prev;

        last.next = newnode;
        newnode.prev = last;

        newnode.next = head;
        head.prev = newnode;
    }

    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    static int sum() {
        if (head == null) {
            return 0;
        }

        int total = 0;
        node temp = head;

        do {
            total += temp.data;
            temp = temp.next;
        } while (temp != head);

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            insert(n);
        }

        System.out.println("\nCircular Doubly Linked List:");
        display();

        System.out.println("Sum of all elements = " + sum());

        sc.close();
    }
}