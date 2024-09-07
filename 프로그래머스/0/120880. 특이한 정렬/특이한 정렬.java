class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] length = new int[numlist.length];
        
        for (int i = 0; i<numlist.length; i++) {
            if (n - numlist[i] < 0) {
                length[i] = (n-numlist[i])*-1;
            }
            else {
                length[i] = n-numlist[i];
            }
        }
        
        int min = 10000;
        int index_min = 0;
        int[] answer = new int[numlist.length];
        for (int i = 0; i<answer.length; i++) {
            for (int j = 0; j<length.length; j++) {
                if (length[j] < min) {
                    min = length[j];
                    index_min = j;
                }
                if (length[j] == min) {
                    if (numlist[j] > numlist[index_min]) {
                        min = length[j];
                        index_min = j;
                    }
                }

            }
            answer[i] = numlist[index_min];
            length[index_min] = Integer.MAX_VALUE;
            min = 10000;
        }
            
        
        return answer;
    }
}

//n과의 거리가 들어있는 배열을 새로 만들기
//그 후 가장 작은 순으로 answer 배열 담기
//만약 거리가 서로 같다면 그의 해당하는 수 끼리 비교하여 더 큰수부터