def solution(myString, pat):
    answer = 0
    temp=""
    for m in myString:
        if m=="A":
            temp+="B"
        else:
            temp+="A"
    if pat in temp:
        answer=1
    else:
        answer=0
    return answer