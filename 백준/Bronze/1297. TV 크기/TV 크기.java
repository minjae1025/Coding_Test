import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        double denominator = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
        int height = (int)((D * H) / denominator);
        int width = (int)((D * W) / denominator);
        System.out.println(height+" "+width);
    }
}