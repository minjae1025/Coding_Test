import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> myToppingCount = new HashMap<>();
        Map<Integer, Integer> youToppingCount = new HashMap<>();
        
        // 전체 토핑 종류를 세어 놓기
        for (int t : topping) {
            youToppingCount.put(t, youToppingCount.getOrDefault(t, 0) + 1);
        }

        int myUniqueCount = 0;
        int youUniqueCount = youToppingCount.size();

        for (int i = 0; i < topping.length - 1; i++) {
            // 현재 토핑을 왼쪽(내) 부분에 추가
            myToppingCount.put(topping[i], myToppingCount.getOrDefault(topping[i], 0)+1);
            
            // 만약 새로운 종류의 토핑이 추가되면 카운트 증가
            if (myToppingCount.get(topping[i]) == 1) {
                myUniqueCount++;
            }

            // 현재 토핑을 오른쪽(너) 부분에서 제거
            youToppingCount.put(topping[i], youToppingCount.get(topping[i]) - 1);
            if (youToppingCount.get(topping[i]) == 0) {
                youToppingCount.remove(topping[i]);
                youUniqueCount--;
            }

            // 두 부분의 종류 수가 같을 때 답 증가
            if (myUniqueCount == youUniqueCount) {
                answer++;
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(int[] topping) {
//         int answer = 0;
//         Set<Integer> my_topping;
//         Set<Integer> you_topping;
//         for (int i = 1; i<topping.length-1; i++) {
//             my_topping = new HashSet<>();
//             you_topping = new HashSet<>();
//             for (int j = 0; j<=i; j++) {
//                 my_topping.add(topping[j]);
//             }
//             for (int j = i+1; j<topping.length; j++) {
//                 you_topping.add(topping[j]);
//             }
            
//             if (my_topping.size() == you_topping.size()) {
//                 answer++;
//             }
//         }
//         return answer;
//     }
// }