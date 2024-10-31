def solution(arr1, arr2):
    answer = 0
    sum1=0
    sum2=0
    if len(arr1) > len(arr2):
        answer = 1
    elif len(arr1) < len(arr2):
        answer = -1
    else:
        for a1 in arr1:
            sum1+=a1
        for a2 in arr2:
            sum2+=a2
        if sum1 > sum2:
            answer = 1
        elif sum1 < sum2:
            answer = -1
        else:
            answer = 0
    return answer