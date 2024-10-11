class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int s_video = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int s_pos = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int s_start = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int s_end = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        if (s_pos >= s_start && s_pos < s_end) {
            s_pos = s_end;
        }
        for (int i = 0; i<commands.length; i++) {
            if (commands[i].equals("prev")) {
                s_pos -= 10;
            }
            else if (commands[i].equals("next")) {
                s_pos += 10;
            }
            
            if (s_pos < 0) {
                s_pos = 0;
            }
            else if (s_pos > s_video) {
                s_pos = s_video;
            }
            
            if (s_pos >= s_start && s_pos < s_end) {
            s_pos = s_end;
            }
        }
        
        String min = Integer.toString(s_pos/60)+"";
        if (s_pos/60 < 10) {
            min = "0" + Integer.toString(s_pos/60);
        }
        String sec = Integer.toString(s_pos%60)+"";
        if (s_pos%60 < 10) {
            sec = "0" + Integer.toString(s_pos%60);
        }
        String answer = min + ":" + sec;
        return answer;
    }
}