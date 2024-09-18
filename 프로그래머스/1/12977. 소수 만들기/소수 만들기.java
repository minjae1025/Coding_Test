class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i<nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                for (int k = j+1; k<nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    for (int s = 2; s<temp; s++) {
                        if (temp % s == 0) {
                            cnt++;
                        }
                    }
                    if (cnt == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}