def solution(dot):
    answer = 0
    dot1, dot2 = dot[0], dot[1]
    if dot1>0:
        if dot2>0:
            answer = 1
        else:
            answer = 4
    else:
        if dot2<0:
            answer = 3
        else:
            answer = 2
    return answer