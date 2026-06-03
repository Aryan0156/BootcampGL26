import java.util.*;
public class Reverese {
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());

        }
        for(int x : list){
            System.out.print(x+" ");
        }
        sc.close();
        Collections.reverse(list);
        System.out.println("\nReversed list: ");
        for(int x : list){
            System.out.print(x+" ");
        }
    }
    
}
