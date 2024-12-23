import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        if (first_num < 10) first_num*=10;
        int compare_num = first_num;
        int n;
        int cnt = 1;
        while (true) {
		    int ten_num = ((compare_num % 10) * 10);
		    int one_num = (compare_num/10 + compare_num%10) % 10;
            n = ten_num + one_num;
            if (n == first_num) {
                break;
            }
            compare_num = n;
            cnt++;
        }
        System.out.println(cnt);
    }
}