#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int answer = 0;
    int total = 1;
    int square = 0;
    for (int i=0; i<num_list_len; i++){
        total = total * num_list[i];
        square = square + num_list[i];
    } 
    if (total < square * square)
        answer = 1;
    else
        answer = 0;
    return answer;
}