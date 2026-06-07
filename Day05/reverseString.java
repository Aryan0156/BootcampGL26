import java.util.*;

public class reverseString {
    static int max = 50;
    static int top = -1;
    static char[] st = new char[max];

    static void push(char data) {
        if (top == max - 1) {
            System.out.println("Overflow");
        } else {
            st[++top] = data;
        }
    }

    static char pop() {
        if (top == -1) {
            return '\0';
        }
        return st[top--];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }

        String rev = "";

        while (top != -1) {
            rev = rev + pop();
        }

        System.out.println("Original String : " + str);
        System.out.println("Reverse String  : " + rev);

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}