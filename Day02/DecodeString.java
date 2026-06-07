import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);

                num = 0;
                current = "";
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                String prev = stringStack.pop();

                String temp = "";

                for (int i = 0; i < repeat; i++) {
                    temp += current;
                }

                current = prev + temp;
            }

            else {
                current += ch;
            }
        }

        System.out.println(current);
        sc.close();
    }
}