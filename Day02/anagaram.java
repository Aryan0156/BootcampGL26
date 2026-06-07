import java.util.Scanner;

public class anagaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String s1 = sc.nextLine().toLowerCase();
        int [] f = new int[26];
        if(s.length() != s1.length()){
            System.out.println("Not Anagram");
            sc.close();
            return;
            
        }
        for(int i = 0; i < s.length(); i++){
            f[s.charAt(i)-'a']++;
            f[s1.charAt(i) -'a']--;
        }
        boolean flag = true;
        for(int i = 0; i < 26; i++){
            if(f[i] != 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"anagram" :"not anagram");

        sc.close();
    }
}
