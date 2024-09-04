import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        while (1 < n) {
            for (int i = 2; i<=n; i++) {
                if (n%i == 0) {
                    n/=i;
                    list.add(i);
                    break;
                }
            }
        }
        int[] temp = new int[list.size()];
        for (int i = 0; i<temp.length; i++) {
            temp[i] = list.get(i);
        }
        
        int[] answer = Arrays.stream(temp).distinct().toArray();
        Arrays.sort(answer);
        return answer;
    }
}