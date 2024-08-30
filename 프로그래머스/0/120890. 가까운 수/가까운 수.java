class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        for (int i = 0; i<array.length; i++) {
            int num = array[i] - n;
            if (num < 0) {
                num *= -1;
            }
            if (num < min) {
                min = num;
                answer = array[i];
                
            }
            if (num == min) {
                if (answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
// if differ>temp:
//             differ=temp
//             answer = i
//         if differ==temp:
//             if answer>i:
//                 answer = i