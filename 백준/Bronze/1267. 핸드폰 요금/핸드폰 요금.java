import java.util.*; 
public class Main {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] call_list = new int[N];
        for (int i = 0; i<N; i++) {
            call_list[i] = sc.nextInt();
        }
        int Y = 0;
        int M = 0;
        for (int i = 0; i<N; i++) {
            int sec = call_list[i];
            Y += ((sec)/30)*10;
            if (sec%30 >= 0) {
                Y += 10;
            }
            M += ((sec)/60)*15;
            if (sec%60 >= 0) {
                M += 15;
            }
        }
        
        if (Y < M) {
            System.out.println("Y "+Y);
        }
        else if (Y > M) {
            System.out.println("M "+M);
        }
        else {
            System.out.println("Y M "+Y);
        }
    }
}