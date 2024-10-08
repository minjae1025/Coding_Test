import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        for (int i = 0; i<8; i++) {
            String temp = sc.next();
            for (int j = 0; j<8; j++) {
                if (i % 2 == 0) {
                    if (temp.charAt(j) == 'F' && j % 2 == 0) {
                        answer++;
                    }
                }
                else {
                    if (temp.charAt(j) == 'F' && j % 2 == 1) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}