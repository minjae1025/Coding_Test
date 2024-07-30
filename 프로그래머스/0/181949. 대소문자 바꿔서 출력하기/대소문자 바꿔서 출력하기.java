import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i<a.length(); i++) {
            char temp = a.charAt(i);
            if (temp >= 65 && temp <= 90) {
                temp += 32;
            }
            else {
                temp -= 32;
            }
            answer += temp;
        }
        System.out.print(answer);
    }
}