class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int day = startday;
        int timecheck = 0;
        int log = 0;
        for (int i = 0; i<schedules.length; i++) {
            int attendance = schedules[i];
            for (int j = 0; j<timelogs[i].length; j++) {
                if (day <= 5) {
                    log = timelogs[i][j];
                    if (log/100 < attendance/100) {
                        timecheck++;
                    }
                    else if (log/100 == attendance/100 && log%100 <= (attendance+10)%100) {
                        timecheck++;
                    }
                }
                day++;
                if (day > 7) {
                    day = 1;
                }
            }
            
            if (timecheck >= 5) {
                answer++;
            }
            day = startday;
            timecheck = 0;
        }
        return answer;
    }
}