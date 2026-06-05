import java.util.*;

public class AlternateQueue {

    static void alternateQueue(Queue<Integer> q) {


        int half = q.size() / 2;
        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < half; i++) {
            temp.add(q.poll());
        }

        while (!temp.isEmpty()) {
            q.add(temp.poll());
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(7);
        q.add(9);
        q.add(5);

        alternateQueue(q);

        for (int x : q) {
            System.out.print(x + " ");
        }
    }
}