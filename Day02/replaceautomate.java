import java.util.*;

public class replaceautomate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase();

        String longest = "";
        int count = 0;

        for (int len = str.length() / 2; len >= 1; len--) {
            for (int i = 0; i <= str.length() - len; i++) {
                String sub = str.substring(i, i + len);

                int first = str.indexOf(sub);
                int last = str.lastIndexOf(sub);
                if (sub.length() > 1) {

                    if (first != last) {
                        longest = sub;

                        int pos = 0;
                        while ((pos = str.indexOf(sub, pos)) != -1) {
                            count++;
                            pos += len;
                        }
                        break;
                    }
                }
                if (!longest.equals("")) {
                    break;
                }
            }
        }

        if (longest.equals("")) {
            System.out.println("No repeated substring found");
        } else {
            System.out.println("Longest Repeated Substring: " + longest);
            System.out.println("Occurrences: " + count);
            System.out.println("Result: " + str.replace(longest, "#"));
        }

        sc.close();
    }
}