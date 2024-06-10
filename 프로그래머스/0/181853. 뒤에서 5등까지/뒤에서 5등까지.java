class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int temp = num_list[0];
        for (int i = 0; i < num_list.length; i++) {
            for (int j = i; j < num_list.length; j++) {
			    if (num_list[i] > num_list[j]) {
				    temp = num_list[j];
				    num_list[j] = num_list[i];
				    num_list[i] = temp;
			    }
		    }
	    }
        for (int i = 0; i<5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}