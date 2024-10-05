import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 버퍼를 비워줍니다.
        String[] list = new String[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLine();  // 각 줄을 입력받습니다.
        }
        char[] equals = list[0].toCharArray();
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < equals.length; j++) {
                if (equals[j] != list[i].charAt(j)) {
                    equals[j] = '?';
                }
            }
        }
        System.out.println(String.valueOf(equals));  // 결과 출력
    }
}