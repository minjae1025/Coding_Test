import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : works){
            pq.offer(num);
        }
        
        while (!pq.isEmpty() && n > 0) {
            int max = pq.poll();

            if (max>1){
                pq.offer(max-1);
            }
            n--;
        }
        
        long answer = 0;
        while(!pq.isEmpty()){
            answer += Math.pow(pq.poll(),2);
        }
        return answer;
    }
}