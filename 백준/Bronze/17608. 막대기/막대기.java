import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        int max = 0;
        int answer = 0;
        
        for (int i = 0; i<number; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}