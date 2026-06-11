import java.util.*;

public class Stringuti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[i]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(char x : arr) {
            System.out.print(x);
        }
        sc.close();
    }
}