import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        
        int[] cnt = new int[81];
        
        for (int i = 1; i<=s1; i++) {
            for (int j = 1; j<=s2; j++) {
                for (int k = 1; k<=s3; k++) {
                    int sum = i + j + k;
                    cnt[sum]++;
                }
            }
        }
        
        int max = 0;
        int index = 0;

        for (int i = 3; i<cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                index = i;
            }
        }
        
        System.out.println(index);
    }
}