import java.util.Scanner;
import java.util.Vector;

public class Main{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str = sc.nextLine();
        System.out.println("Enter second String : ");
        String str1 = sc.nextLine();
        Vector <Character> v = new Vector<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                v.add('_');
            }
            else{
                v.add(str.charAt(i));
            }
        }
        for(char x:v){
            System.out.print(x);
        }
        System.out.print(str1);
sc.close();

    }
}