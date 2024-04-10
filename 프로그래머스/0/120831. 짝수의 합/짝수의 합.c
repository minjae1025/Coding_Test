#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int num;
    for(num = 2; num <= n; num +=2) {
        answer += num; }
    return answer;
}