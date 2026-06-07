import java.util.Scanner;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    static void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    static void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack Elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    push(data);
                    break;

                case 2:
                    pop();
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

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}