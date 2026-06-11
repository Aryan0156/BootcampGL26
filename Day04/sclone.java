class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sclone{

    static Nodes head = null;

    static void insert(int data) {
        Nodes newNode = new Nodes(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Nodes temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static Nodes cloneList(Nodes head) {

        if (head == null)
            return null;

        Nodes newHead = new Nodes(head.data);
        Nodes original = head.next;
        Nodes copy = newHead;

        while (original != null) {
            copy.next = new Nodes(original.data);

            copy = copy.next;
            original = original.next;
        }

        return newHead;
    }

    static void display(Nodes head) {
        Nodes temp = head;

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

        Nodes clonedHead = cloneList(head);

        System.out.print("Cloned List  : ");
        display(clonedHead);
    }
}