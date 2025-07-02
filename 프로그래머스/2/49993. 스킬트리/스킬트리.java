import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String tree : skill_trees) {
            String[] current_tree = tree.split("");
            if (skill_check(skill, current_tree)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean skill_check(String skill, String[] current_tree) {
        int idx = 0;
        String[] order = skill.split("");
        for (String current_skill : current_tree) {
            if (skill.contains(current_skill)) {
                if (current_skill.equals(order[idx])) {
                    skill = skill.substring(1);
                    idx++;
                }
                else {
                    return false;
                }
            }
            
            if (skill.length() == 1) {
                return true;
            }
        }
        return true;
    }
}