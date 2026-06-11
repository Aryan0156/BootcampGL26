public class nodes {
    int data;
    Node next;

    nodes(int data) {
        this.data = data;
    }
}

public class clone {

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

    static Node cloneList(Node head) {

        if (head == null)
            return null;

        Node newHead = new Node(head.data);
        Node original = head.next;
        Node copy = newHead;

        while (original != null) {
            copy.next = new Node(original.data);

            copy = copy.next;
            original = original.next;
        }

        return newHead;
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

        insert(10);
        insert(20);
        insert(30);
        insert(40);

        System.out.print("Original List: ");
        display(head);

        Node clonedHead = cloneList(head);

        System.out.print("Cloned List  : ");
        display(clonedHead);
    }
} 
    

