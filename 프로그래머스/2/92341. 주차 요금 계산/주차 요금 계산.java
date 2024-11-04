import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<Integer, Integer> carTime = new HashMap<>();
        Map<Integer, Integer> inTime = new HashMap<>();

        for (String record : records) {
            String[] strTmp = record.split(" ");
            int time = minTime(strTmp[0]);
            int carNumber = Integer.parseInt(strTmp[1]);
            String state = strTmp[2];

            if (state.equals("IN")) {
                inTime.put(carNumber, time);
            } else {
                int parkTime = time - inTime.get(carNumber);
                carTime.put(carNumber, carTime.getOrDefault(carNumber, 0) + parkTime);
                inTime.remove(carNumber);
            }
        }

        int endOfDay = minTime("23:59");
        for (int carNumber : inTime.keySet()) {
            int parkTime = endOfDay - inTime.get(carNumber);
            carTime.put(carNumber, carTime.getOrDefault(carNumber, 0) + parkTime);
        }

        List<Integer> answerList = new ArrayList<>();
        List<Integer> carNumbers = new ArrayList<>(carTime.keySet());
        Collections.sort(carNumbers);

        for (int carNumber : carNumbers) {
            int totalTime = carTime.get(carNumber);
            if (totalTime > fees[0]) {
                int addTime = totalTime - fees[0];
                int totalFee = fees[1] + (addTime / fees[2]) * fees[3];
                if (addTime % fees[2] > 0) {
                    totalFee += fees[3];
                }
                answerList.add(totalFee);
            } else {
                answerList.add(fees[1]);
            }
        }

        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    int minTime(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        return (hour * 60) + minute;
    }
}
