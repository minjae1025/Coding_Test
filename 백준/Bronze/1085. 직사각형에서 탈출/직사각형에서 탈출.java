import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int w = sc.nextInt();
      int h = sc.nextInt();
      int vertex_length = Math.min((w-x), (h-y));
      int one_dot = Math.min(x, y);
      if (vertex_length <= one_dot) {
        System.out.println(vertex_length);
      }
      else {
        System.out.println(one_dot);
      }
  }
}