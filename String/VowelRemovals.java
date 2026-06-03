import java.util.*;

public class VowelRemovals {
    static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        String str;
        System.out.println("Please enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        str = str.toLowerCase();

        char ch;
        for(int i =0; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ){
                v.add(ch);
            }
        }
        for(char x :v)
            System.out.print(x);
        sc.close();
        

    }
}
