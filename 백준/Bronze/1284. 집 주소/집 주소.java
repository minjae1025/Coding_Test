import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        do {
            str = sc.next();
            list.add(str);
        } while (!str.equals("0"));
        
        for (int i = 0; i<list.size()-1; i++) {
            str = list.get(i);
            int cnt = 1;
            for (int j = 0; j<str.length(); j++) {
                char num = str.charAt(j);
                if (num == '0') cnt+=4;
                else if (num == '1') cnt+=2;
                else cnt+=3;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
