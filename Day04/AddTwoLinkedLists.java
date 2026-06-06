class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class AddTwoLinkedLists {

    static Node head1 = null;
    static Node head2 = null;

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node addLists(Node h1, Node h2) {

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (h1 != null || h2 != null || carry != 0) {

            int sum = carry;

            if (h1 != null) {
                sum += h1.data;
                h1 = h1.next;
            }

            if (h2 != null) {
                sum += h2.data;
                h2 = h2.next;
            }

            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        head1 = insert(head1, 2);
        head1 = insert(head1, 4);
        head1 = insert(head1, 3);

        head2 = insert(head2, 5);
        head2 = insert(head2, 6);
        head2 = insert(head2, 4);

        System.out.print("List1: ");
        display(head1);

        System.out.print("List2: ");
        display(head2);

        Node result = addLists(head1, head2);

        System.out.print("Sum  : ");
        display(result);
    }
}