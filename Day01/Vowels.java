import java.util.*;

public class Vowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vowels you want to enter: ");
        String s = sc.nextLine();
        int count = 0;
        char ch;
        Vector<Character> vowels = new Vector<>();
        for(int i =0; i<s.length(); i++){
            ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                vowels.add(ch);
                count++;
            }
        }
        System.out.println("The vowels are: " +count);
        System.out.println("The vowels are: " +vowels);
        sc.close();
    }
}
