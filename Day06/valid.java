import java.util.*;

public class valid {
    static Boolean svalid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch=='['){
                st.push(ch);
                continue;
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            }
            if(st.peek() == '(' && ch==')'
                    || st.peek() =='{'  && ch =='}'
                    || st.peek()=='[' && ch==']'){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(svalid(str));
        sc.close();
    }
}
