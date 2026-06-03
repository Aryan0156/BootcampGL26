import java.util.*;

public class removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Character> v = new Vector<>();
        String str  = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            if(!v.contains(str.charAt(i))){
                v.add(str.charAt(i));
            }

        }
        for(char c : v){
            System.out.print(c);
        }
        sc.close();
    }
}
