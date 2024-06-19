class Solution {
    public int[] solution(int[] arr) {
        int cnt = 1;
        while (true) {
            if (cnt >= arr.length) {
                break;
            }
            else if (arr.length <= 1) {
                //cnt = arr.length;
                break;
            }
            else {
                cnt *= 2;
            }
        }
        
        int[] answer = new int[cnt]; 
        for (int i = 0; i<answer.length; i++) {
            if (i<arr.length)
                answer[i] = arr[i];
            else 
                answer[i] = 0;
        }
        return answer;
    }
}