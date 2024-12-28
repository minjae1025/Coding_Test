import java.util.*;
public class Main {
    static int N;
    static int min;
    static int max;
    static int increase;
    static int decrease;
    static int minute;
    static int exercise = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        min = sc.nextInt();
        max = sc.nextInt();
        increase = sc.nextInt();
        decrease = sc.nextInt();
        int now = min;

        if (max - min < increase) {
	        minute = -1;
	    }
	    else {
	        play(now, 1);
	    }
        
        System.out.print(minute);
    }
    static void play(int now, int count) {
        if (now+increase <= max) {
            now += increase;
            exercise++;
        }
        else {
            if (now - decrease < min) {
                now = min;
            }
	    else {
		now -= decrease;
            }
        }
	    //System.out.println(now + " " + count + " " + exercise);
        if (exercise >= N) {
	        minute = count;
            return;
        }
        play(now, count + 1);
        return;
    }
}