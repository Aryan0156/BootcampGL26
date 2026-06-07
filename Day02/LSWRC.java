import java.util.Scanner;

public class LSWRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[str.charAt(start)]--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println("Length = " + maxLen);
        sc.close();
    }
}