import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        if(str.equals(str1)){
            System.out.println("String is same");
        }
        else{
            System.out.println("String is not same");
        }
        sc.close();

    }
}
