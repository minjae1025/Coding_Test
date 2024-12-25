import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int[] alps = new int[26];
        for(int i = 0; i<sentence.length(); i++) {
            char alp = sentence.charAt(i);
            if (alp <= 'Z') alps[alp-'A']++;
            else alps[alp-'a']++;
        }
        
        int cnt = 0;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i<alps.length; i++) {
            if (alps[i] > cnt) {
                index = i;
                cnt = alps[i];
                flag = false;
            }
            else if (alps[i] == cnt) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("?");
        }
        else {
            System.out.println((char)(index+'A'));
        }
    }
}