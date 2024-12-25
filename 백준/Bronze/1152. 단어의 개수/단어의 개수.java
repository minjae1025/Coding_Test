import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().strip();
        if (sentence.equals("")) {
            System.out.println(0);
        }
        else {
            String[] words = sentence.split(" ");
            System.out.print(words.length);
        }
    }
}