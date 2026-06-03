import java.util.*;

public class replace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine().toLowerCase();

        String longest = "";
        int occurrence = 0;


        for (int len = str.length() - 1; len >= 1; len--) {

            boolean foundLongest = false;

            for (int i = 0; i <= str.length() - len; i++) {

                String sub = "";


                for (int j = i; j < i + len; j++) {
                    sub += str.charAt(j);
                }

                int count = 0;
                int first = -1;
                int last = -1;


                for (int k = 0; k <= str.length() - len; k++) {

                    boolean found = true;

                    for (int t = 0; t < len; t++) {

                        if (sub.charAt(t) != str.charAt(k + t)) {
                            found = false;
                            break;
                        }
                    }

                    if (found) {

                        count++;

                        if (first == -1) {
                            first = k;
                        }

                        last = k;
                    }
                }

                if (first != -1 && first != last) {
                    longest = sub;
                    occurrence = count;
                    foundLongest = true;
                    break;
                }
            }

            if (foundLongest) {
                break;
            }
        }

        if (longest.equals("")) {
            System.out.println("No repeated substring found");
            sc.close();
            return;
            
        }


        String res = "";

        for (int i = 0; i < str.length();) {

            boolean match = true;

            if (i + longest.length() <= str.length()) {

                for (int j = 0; j < longest.length(); j++) {

                    if (str.charAt(i + j) != longest.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    res += "#";
                    i += longest.length();
                } else {
                    res += str.charAt(i);
                    i++;
                }

            } else {
                res += str.charAt(i);
                i++;
            }
        }

        System.out.println("Longest String : " + longest);
        System.out.println("Occurrence     : " + occurrence);
        System.out.println("Result         : " + res);

        sc.close();
    }
}