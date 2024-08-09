def solution(my_string, n):
    answer = ''
    for str in my_string:
        for i in range(n):
            answer+=str
    return answer