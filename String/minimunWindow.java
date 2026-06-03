import java.util.Scanner;

public class minimunWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String s = sc.nextLine();

        System.out.print("Enter target string: ");
        String t = sc.nextLine();

        int[] need = new int[256];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (need[ch] > 0) {
                count--;
            }

            need[ch]--;

            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                need[leftChar]++;

                if (need[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("No window found");
        } else {
            System.out.println("Minimum Window: "
                    + s.substring(start, start + minLen));
        }
        sc.close();
    }
}