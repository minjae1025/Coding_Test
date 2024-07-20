class Solution {
    public long solution(long n) {
        String cnt = ""+n;
        int[] temp = new int[cnt.length()];
        String Sorting = "";
        int count = 0;
        while (true) {
            temp[count++] += n%10;
            n/=10;
            if (n < 1) {
                break;
            }
        }
        for (int i = 0; i<temp.length; i++) {
            for (int j = 0; j<temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int temp_arr = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp_arr;
                }
            }
        }
        for (int i = 0; i<temp.length; i++) {
            Sorting += Integer.toString(temp[i]);
        }
         
        return Long.parseLong(Sorting);
    }
}