def solution(n):
    answer = 0
    while(True):
        answer+=1
        if 7*answer/n>=1:
            break;
    return answer