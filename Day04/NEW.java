import java.util.*;
public class NEW {
    


 
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.reverse(list);

        for (int x : list) {
            map.put(x, 1);
        }

        for (int count : map.keySet()) {
            System.out.print(count + " ");
        }

        sc.close();
    }
}