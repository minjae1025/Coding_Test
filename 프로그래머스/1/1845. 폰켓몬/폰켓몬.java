import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {    
        int pokemon_num = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(nums);
        return pokemon_num < nums.length? pokemon_num: nums.length;
    }
}