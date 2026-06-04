import java.util.*;

public class prefix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        
        for (int i = 0; i < n; i++) {
            list.addFirst(sc.nextInt());
        }

        String prefix = sc.next();

        
        list.removeIf(x -> String.valueOf(x).startsWith(prefix));

    
        for (int roll : list) {
            System.out.println("Roll: " + roll);
        }
        sc.close();
    }
}