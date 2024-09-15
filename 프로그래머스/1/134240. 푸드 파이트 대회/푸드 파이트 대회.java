import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; 
            for (int j = 0; j < count; j++) {
                list.add(Integer.toString(i));
            }
        }
        
        String[] real_food = new String[list.size()];
        list.toArray(real_food);
        
        for (int i = 0; i < real_food.length; i++) {
            answer += real_food[i];
        }
        
        answer += "0";
        
        for (int i = real_food.length - 1; i >= 0; i--) {
            answer += real_food[i];
        }
        
        return answer;
    }
}
