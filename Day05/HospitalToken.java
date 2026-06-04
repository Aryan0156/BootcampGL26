import java.util.Scanner;

public class HospitalToken {

    static int[] q = new int[100];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int token) {

        if ((rear + 1) % q.length == front) {
            System.out.println("Queue is Full");
            return;
        }

        
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % q.length;
        }

        q[rear] = token;
    }

    static void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int removed = q[front];
        System.out.println("Removed Token: " + removed);

    
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % q.length;
        }
    }

    static void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(q[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % q.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {

        int n = sc.nextInt();

        switch (n) {

            case 1:
                int token = sc.nextInt();
                enqueue(token);
                break;

            case 2:
                dequeue();
                break;

            case 3:
                display();
                break;

            case 4:
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    }
}