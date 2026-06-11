class ListNodes{
    int data;
    ListNodes next;

    ListNodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoopLinkedList {

    static ListNodes head = null;

    static void insert(int data) {
        ListNodes newNode = new ListNodes(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNodes temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static boolean hasLoop() {
        ListNodes slow = head;
        ListNodes fast = head;

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
        ListNodes slow = head;
        ListNodes fast = head;
        boolean loopFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopFound = true;
                break;
            }
        }

        if (!loopFound) {
            return;
        }

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
        ListNodes temp = head;

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

        // Creating loop: 50 -> 30
        ListNodes temp = head;
        ListNodes third = null;

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