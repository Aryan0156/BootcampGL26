import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoopLinkedList {

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static void removeLoop() {
        Node slow = head;
        Node fast = head;
        boolean loopFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopFound = true;
                break;
            }
        }

        if (!loopFound)
            return;

        slow = head;

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        fast.next = null;
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        // Creating a loop: 50 -> 30
        Node temp = head;
        Node third = null;

        while (temp.next != null) {
            if (temp.data == 30) {
                third = temp;
            }
            temp = temp.next;
        }

        temp.next = third;

        System.out.println("Loop Present Before Removal: " + hasLoop());

        removeLoop();

        System.out.println("Loop Present After Removal: " + hasLoop());

        System.out.print("Linked List: ");
        display();
    }
}