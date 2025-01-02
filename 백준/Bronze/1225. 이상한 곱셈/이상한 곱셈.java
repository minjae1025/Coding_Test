import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        char[] num1 = A.toCharArray();
        char[] num2 = B.toCharArray();
        long sum = 0;
        for (int i = 0; i<num1.length; i++) {
            for (int j = 0; j<num2.length; j++) {
                int n1 = (int)(num1[i] - '0');
                int m1 = (int)(num2[j] - '0');
                sum += (n1*m1);
            }
        }
        System.out.println(sum);
    }
}