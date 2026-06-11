import java.util.Scanner;

class Naode {
    int data;
    Naode next;
    Naode prev;

    Naode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PriceList {

    static Naode head = null;

    static void insert(int x) {
        Naode newNode = new Naode(x);

        if (head == null) {
            head = newNode;
            return;
        }

        Naode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    static void display() {
        Naode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static void update(int pos, int newPrice) {
        Naode temp = head;

        while (temp != null && pos > 1) {
            temp = temp.next;
            pos--;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.data = newPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        System.out.println("Original Price List:");
        display();

        System.out.print("Enter position to update: ");
        int pos = sc.nextInt();

        System.out.print("Enter new price: ");
        int price = sc.nextInt();

        update(pos, price);

        System.out.println("Updated Price List:");
        display();

        sc.close();
    }
}