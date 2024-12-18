import java.util.*;

class Solution {
    Set<Integer> numSet = new HashSet<>();
    public int solution(String numbers) {
        recursive("", numbers);
        
        System.out.print(numSet);
        Integer[] totalNums = numSet.toArray(new Integer[0]);
        
        int answer = 0;
        
        for (int i = 0; i<totalNums.length; i++) {
            boolean flag = true;
            int tmp = totalNums[i].intValue();
            int max = (int)Math.sqrt(tmp);
            for (int j = 2; j<=max; j++) {
                if (tmp % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void recursive(String num, String other) {
        if (!num.equals("") && Integer.valueOf(num) > 1) {
            numSet.add(Integer.valueOf(num));
        }
        for (int i = 0; i<other.length(); i++) {
            recursive(num + other.charAt(i), other.substring(0, i) + other.substring(i+1));
        }
    }
}