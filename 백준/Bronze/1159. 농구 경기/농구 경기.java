import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] alps = new int[26];
        int length = sc.nextInt();
        for (int i = 0; i<length; i++) {
            String tmp = sc.next();
            char alp = tmp.charAt(0);
            alps[alp-'a']++;
        }
        
        String answer = "";
        for (int i = 0; i<alps.length; i++) {
            if (alps[i] >= 5) {
                answer += (char)(i+'a');
            }
        }
        
        if (answer.isBlank()) {
            answer = "PREDAJA";
        }
        
        System.out.println(answer);
    }
}