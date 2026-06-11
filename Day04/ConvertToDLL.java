class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int data) {
        this.data = data;
    }
}

public class ConvertToDLL {

    static DLLNode head = null;

    static void insert(int data) {
        DLLNode newNode = new DLLNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void convertToDLL() {
        DLLNode curr = head;
        DLLNode previous = null;

        while (curr != null) {
            curr.prev = previous;
            previous = curr;
            curr = curr.next;
        }
    }

    static void displayForward() {
        DLLNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void displayBackward() {
        DLLNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(40);

        convertToDLL();

        System.out.print("Forward : ");
        displayForward();

        System.out.print("Backward: ");
        displayBackward();
    }
}