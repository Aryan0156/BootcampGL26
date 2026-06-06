class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeLinkedList {

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

    static boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        
        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
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

        insert(1);
        insert(2);
        insert(3);
        insert(2);
        insert(1);

        display();

        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}