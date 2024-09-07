class Solution {
    public String solution(String polynomial) {
        String[] arr_poly = polynomial.split(" ");
        int p_num = 0;
        int num = 0;
        for (int i = 0; i<arr_poly.length; i++) {
            if (arr_poly[i].contains("x")) {
                if (arr_poly[i].length() == 1) {
                    p_num++;
                }
                else {
                    String temp = "";
                    for (int j = 0; j<arr_poly[i].length()-1; j++) {
                        temp += arr_poly[i].charAt(j);
                    }
                    p_num += Integer.parseInt(temp);
                }
            }
            else if (!arr_poly[i].contains("+")) {
                num += Integer.parseInt(arr_poly[i]);   
            }
        }
        String x_num = Integer.toString(p_num);
        String s_num = Integer.toString(num);
        
        if (p_num == 1 && num == 0) {
            return "x";
        }
        else if (num == 0 && p_num > 0) {
            return x_num+"x";
        }
        else if (num == 0) {
            return x_num;
        }
        else if (p_num == 0) {
            return s_num;
        }
        else if (p_num == 1 && num > 0) {
            return "x + "+s_num;
        }
        else {
            return x_num+"x + "+s_num;
        }
    }
}

//split을 통해 공백을 기준으로 나누기
//contains를 이용해 x가 있다면 그 앞 글자를 int화 한 후, 더하기
//만약, x가 들어간 문자열의 길이가 1이라면 +1;
//그 후 nx + m 과 같은 형식으로 리턴하기