def solution(arr):
    answer = []
    for a in arr:
        temp=[]
        temp.append(a)
        temp=temp*a
        answer.extend(temp)
    return answer