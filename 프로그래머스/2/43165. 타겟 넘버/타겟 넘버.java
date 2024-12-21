class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, numbers[0], 0, target);
        dfs(numbers, -1 * numbers[0], 0, target);

        return answer;
    }   

    public void dfs(int[] numbers, int num, int depth, int target) {
        if(depth == numbers.length - 1) {
            if(num == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, num + numbers[depth + 1], depth + 1, target);
        dfs(numbers, num - numbers[depth + 1], depth + 1, target);
    }   
}