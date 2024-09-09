import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> list = new ArrayDeque<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.offer(arr[i]);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                int size = list.size();
                for (int j = query[i] + 1; j < size; j++) {
                    if (!list.isEmpty()) {
                        list.removeLast();
                    }
                }
            } else {
                int size = list.size();
                for (int j = 0; j < query[i]; j++) {
                    if (!list.isEmpty()) {
                        list.removeFirst();
                    }
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.poll(); // list에서 값을 제거하면서 배열에 추가
        }

        return answer;
    }
}
