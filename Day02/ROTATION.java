import java.util.Scanner;

public class ROTATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter L for Left or R for Right rotation: ");
        char ch = sc.next().toUpperCase().charAt(0);
        char  [] rotate = new char[str.length()];

        int len = str.length();
        k = k%len;
        for(int i =0; i<len; i++){
            if(ch=='L'){
                rotate[i] = str.charAt((i+k)%len);
            } else  {
                rotate[i] = str.charAt((i-k+len)%len);

            }
        }
        System.out.println("After Rotation :\n" + new String(rotate));
        sc.close();
    }
}