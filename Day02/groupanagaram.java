import java.util.*;

public class groupanagaram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String [] s = new String[n];
        HashMap<String ,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            s[i] = sc.nextLine();

        }
        for(String word : s){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());

            }
            map.get(key).add(word);

        }
        for(ArrayList<String> list : map.values()){
            System.out.println(list);
        }
        sc.close();

    }
}
