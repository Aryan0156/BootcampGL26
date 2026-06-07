import java.util.*;

public class nonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String v = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch != str.charAt(j)) {
                    v += ch;
                }
            }
        }
        for (int i = 0; i < v.length(); i++) {
            System.out.print(v.charAt(i));
        }
        sc.close();
    }
}