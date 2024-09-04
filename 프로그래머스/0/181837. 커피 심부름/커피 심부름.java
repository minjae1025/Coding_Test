class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String[][] menu = {   
                            {"iceamericano" , "4500"}, 
                            {"americanoice", "4500"}, 
                            {"hotamericano", "4500"}, 
                            {"americanohot", "4500"}, 
                            {"icecafelatte", "5000"}, 
                            {"cafelatteice", "5000"}, 
                            {"hotcafelatte", "5000"}, 
                            {"cafelattehot", "5000"}, 
                            {"americano", "4500"}, 
                            {"cafelatte", "5000"}, 
                            {"anything", "4500"}
                        };
        for (int i = 0; i<order.length; i++) {
            for (int j = 0; j<menu.length; j++) {
                if (order[i].equals(menu[j][0])) {
                    answer += Integer.parseInt(menu[j][1]);
                }
            }
        }
        return answer;
    }
}