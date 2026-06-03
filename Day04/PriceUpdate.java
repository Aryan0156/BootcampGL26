import java.util.*;
public class PriceUpdate {
    public static void main(String[] args){
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the position to update: ");
        int pos = sc.nextInt();
        System.out.println("Enter the new price: ");
        int newprice = sc.nextInt();

    
        list.set(pos-1,newprice);
        sc.close();
       for(int x : list){
        System.out.print(x+" ");
       }
    }
}
