def solution(s1, s2):
    answer = 0
    for s1_1 in s1:
        for s2_2 in s2:
            if s1_1 == s2_2:
                answer+=1
    return answer