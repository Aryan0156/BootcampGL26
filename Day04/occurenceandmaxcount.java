import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class occurenceandmaxcount {

    static Node head;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    static int count() {
        if (head == null)
            return 0;

        int cnt = 0;
        Node temp = head;

        do {
            cnt++;
            temp = temp.next;
        } while (temp != head);

        return cnt;
    }

    static void display() {
        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int data = sc.nextInt();
            if(data == -1){
                break;

            }
            else{
                insert(data);
            }
        }
        display();

        System.out.println("Count = " + count());
    }
}