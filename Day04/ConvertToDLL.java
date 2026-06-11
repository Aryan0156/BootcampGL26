class DLLLNode {
    int data;
    DLLLNode next;
    DLLLNode prev;

    DLLLNode(int data) {
        this.data = data;
    }
}

public class ConvertToDLL {

    static DLLLNode head = null;

    static void insert(int data) {
        DLLLNode newNode = new DLLLNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DLLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void convertToDLL() {
        DLLLNode curr = head;
        DLLLNode previous = null;

        while (curr != null) {
            curr.prev = previous;
            previous = curr;
            curr = curr.next;
        }
    }

    static void displayForward() {
        DLLLNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void displayBackward() {
        DLLLNode temp = head;

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