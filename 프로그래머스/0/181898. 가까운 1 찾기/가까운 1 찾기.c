#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int solution(int arr[], size_t arr_len, int idx) {
    int answer = 0;
    for (int i = 0; i<arr_len; i++) {
        if (arr[i]==1) {
            if (i==idx) {
                answer = idx;
            break;
            } else if (i>idx) {
                answer = i;
            break;
            } else
                answer = -1;
        } else {
            answer = -1;
        }
    }
    return answer;
}