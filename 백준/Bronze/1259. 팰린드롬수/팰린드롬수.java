import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        do {
            str = Integer.toString(sc.nextInt());
            list.add(str);
        } while (!str.equals("0"));
        
        StringBuffer tmp;
        
        for (int i = 0; i<list.size()-1; i++) {
            tmp = new StringBuffer(list.get(i));
            String reverse = tmp.reverse().toString();
            if (list.get(i).equals(reverse)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}