import java.util.*;

class Solution {
    public int[] solution(String s) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<List<Integer>> tupleList = new ArrayList<>();

        String[] sets = s.split("\\},\\{");
        
        for (int i = 0; i < sets.length; i++) {
            sets[i] = sets[i].replace("{", "").replace("}", "");
            String[] numbers = sets[i].split(",");

            List<Integer> currentSet = new ArrayList<>();
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].isEmpty()) {
                    int num = Integer.parseInt(numbers[j]);
                    currentSet.add(num);
                    uniqueElements.add(num);
                }
            }
            tupleList.add(currentSet);
        }

        Collections.sort(tupleList, Comparator.comparingInt(List::size));
        
        int[] answer = new int[uniqueElements.size()];
        int index = 0;

        for (int i = 0; i < tupleList.size(); i++) {
            List<Integer> set = tupleList.get(i);
            for (int j = 0; j < set.size(); j++) {
                Integer number = set.get(j);
                if (uniqueElements.contains(number)) {
                    answer[index++] = number;
                    uniqueElements.remove(number);
                    break;
                }
            }
        }

        return answer;
    }
}
