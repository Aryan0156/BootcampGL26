import java.util.Scanner;

public class QueueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted Element: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element: " + front.data);
    }

    static void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    enqueue(data);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
} 
    

