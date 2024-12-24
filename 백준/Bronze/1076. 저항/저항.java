import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] list = {
            "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
                        };
        String[] resistance = new String[3];
        resistance[0] = sc.next();
        resistance[1] = sc.next();
        resistance[2] = sc.next();
        long answer = 0;
        String num = "";
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<list.length; j++) {
                if (resistance[i].equals(list[j])) {
                    if (i == 0) {
                        num += j;
                    }
                    else if (i == 1) {
                        num += j;
                    }
                    else {
                        answer = Integer.parseInt(num) * (long)Math.pow(10, j);
                    }
                    break;
                }
            }
	    //System.out.println(num + " " + answer);
        }
        System.out.print(answer);
    }
}