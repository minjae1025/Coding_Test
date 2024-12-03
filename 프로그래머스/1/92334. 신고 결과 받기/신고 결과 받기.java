import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> report_cnt = new HashMap<>();
        
        for (String id : id_list) {
            report_cnt.put(id, new HashSet<>());
        }
        
        for (String to_report : report) {
            String[] tmp = to_report.split(" ");
            report_cnt.get(tmp[1]).add(tmp[0]);
        }
        
        for (String id : id_list) {
            if ((report_cnt.get(id)).size() >= k) {
                String[] list = report_cnt.get(id).toArray(new String[0]);
                for (int i = 0; i<id_list.length; i++) {
                    for (String report_id : list) {
                        if (id_list[i].equals(report_id)) {
                            answer[i]++;
                        }
                    }
                }
            }
        }
        return answer;
    }
} 