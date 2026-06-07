import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class sort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i = 0; i<n; i++){
            v.add(sc.nextInt());
        }
        for(int x:v ){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        v.clear();
        for(int i = 0; i<map.getOrDefault(0,0); i++){
            v.add(0);
        }
        for(int i = 0; i<map.getOrDefault(1,0); i++){
            v.add(1);
        }
        for(int i = 0; i<map.getOrDefault(2,0); i++){
            v.add(2);
        }
        System.out.println("Total sorting");
       for(int x: v){
           System.out.print(x+" ");
       }
sc.close();
    }
}
