import java.util.*;

public class removeduplicate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.nextLine();

        Vector<Character> v = new Vector<>();

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)!=str.charAt(i+1)){
                v.add(str.charAt(i));
            }
        }
        v.add(str.charAt(str.length()-1));
        for(char c : v){
            System.out.print(c);
        }
    }
}
