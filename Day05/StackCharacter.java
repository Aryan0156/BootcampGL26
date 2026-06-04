

import java.util.*;

public class StackCharacter {

    static char[] stack = new char[100];
    static int top = -1;

    static void push(char ch) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = ch;
    }

    static void pop() {
        if (top == -1) {
            return;
        }

        char c = stack[top--];
        System.out.print(c);
    }

    static boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                push(ch);
            } else {

                while (!isEmpty()) {
                    pop();
                }

                System.out.print(" ");
            }
        }
        while (!isEmpty()) {
            pop();
        }

        sc.close();
    }
}