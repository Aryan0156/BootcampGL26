import java.util.Scanner;

public class CircularQueue {

    static int max = 5;
    static int[] queue = new int[max];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int data) {

        if ((rear + 1) % max == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        queue[rear] = data;
        System.out.println(data + " inserted");
    }

    static void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted element: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
    }

    static void peek() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element: " + queue[front]);
    }

    static void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % max;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n----- CIRCULAR QUEUE MENU -----");
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

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}