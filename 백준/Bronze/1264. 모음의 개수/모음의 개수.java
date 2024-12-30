import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        ArrayList<Integer> list = new ArrayList<>();
        do {
            str = sc.nextLine();
            int cnt = 0;
            for (int i = 0; i<str.length(); i++) {
                char alp = str.toLowerCase().charAt(i);
                if (alp=='a' || alp=='e' || alp=='i' || alp=='o' || alp=='u') {
                    cnt++;
                }
            }
            list.add(cnt);
        } while (!str.equals("#"));
        
        for (int i = 0; i<list.size()-1; i++) {
            System.out.println(list.get(i));
        }
    }
}