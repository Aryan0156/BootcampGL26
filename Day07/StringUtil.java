import java.util.*;

public class StringUtil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        // Sorting characters in ascending ASCII order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted String: ");
        for (char ch : arr) {
            System.out.print(ch+" ");
        }

        sc.close();
    }
}